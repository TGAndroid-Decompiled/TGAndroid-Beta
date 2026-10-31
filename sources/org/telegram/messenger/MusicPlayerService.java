package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class MusicPlayerService extends Service implements us {
    public static final boolean f14497w = !TextUtils.isEmpty(i0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient f14498a;
    public AudioManager f14499b;
    public android.support.v4.media.session.a0 f14500c;
    public android.support.v4.media.session.d0 d;
    public Bitmap e;
    public int f14501f;
    public ImageReceiver h;
    public boolean f14502n;
    public String f14503r;
    public final t0 f14504s = new t0(2);

    public static int b(int i10) {
        if (Build.VERSION.SDK_INT < 31 && d6.i()) {
            return i10 & (-100663297);
        }
        return i10;
    }

    public static float d(jj jjVar, boolean z10) {
        if (z10) {
            if (jjVar != null) {
                if (jj.R4(jjVar.f16337k) || jjVar.h4()) {
                    return MediaController.B().f14470p0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public final void a(org.telegram.messenger.jj r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(org.telegram.messenger.jj, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.Components.r8 r8Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z10) {
            i10 = 600;
        } else {
            i10 = 100;
        }
        int i11 = i10;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z10) {
                    fileLocation2 = user.photo.photo_big;
                } else {
                    fileLocation2 = user.photo.photo_small;
                }
                if (fileLocation2 != null) {
                    b8.G(d20.f15147s0);
                    File K = b8.K(fileLocation2, null, true, true);
                    if (K.exists()) {
                        float f7 = i11;
                        return hc.K(K.getAbsolutePath(), null, f7, f7, false);
                    } else if (z10) {
                        if (z11) {
                            this.f14503r = b8.r(null, fileLocation2);
                            this.h.q0(ic.l(d20.f15147s0, 0, user), "", null, null, null, 0);
                        } else {
                            this.f14503r = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (z10) {
                    fileLocation = chat.photo.photo_big;
                } else {
                    fileLocation = chat.photo.photo_small;
                }
                if (fileLocation != null) {
                    b8.G(d20.f15147s0);
                    File K2 = b8.K(fileLocation, null, true, true);
                    if (K2.exists()) {
                        float f10 = i11;
                        return hc.K(K2.getAbsolutePath(), null, f10, f10, false);
                    } else if (z10) {
                        if (z11) {
                            this.f14503r = b8.r(null, fileLocation);
                            this.h.q0(ic.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.f14503r = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.t6.T(this);
        if (tLObject instanceof TLRPC.User) {
            r8Var = new org.telegram.ui.Components.r8(0, (TLRPC.User) tLObject);
        } else {
            r8Var = new org.telegram.ui.Components.r8((TLRPC.Chat) tLObject);
        }
        r8Var.f29873r = 1;
        float f11 = i11;
        Bitmap createBitmap = Bitmap.createBitmap(i0.L(f11), i0.L(f11), Bitmap.Config.ARGB_8888);
        r8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        r8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        int i12;
        float f7;
        if (i10 == zs.f19616g2) {
            jj jjVar = MediaController.B().f14482u0;
            if (jjVar != null) {
                a(jjVar, false);
            } else {
                stopSelf();
            }
        } else if (i10 == zs.f19628i2) {
            jj jjVar2 = MediaController.B().f14482u0;
            if (jjVar2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * jjVar2.f16326h0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.f14498a;
                if (remoteControlClient != null) {
                    if (MediaController.B().H()) {
                        i12 = 2;
                    } else {
                        i12 = 3;
                    }
                    if (MediaController.B().H()) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    remoteControlClient.setPlaybackState(i12, round, f7);
                }
            }
        } else if (i10 == zs.R1) {
            String str3 = (String) objArr[0];
            jj jjVar3 = MediaController.B().f14482u0;
            if (jjVar3 != null && (str2 = this.f14503r) != null && str2.equals(str3)) {
                a(jjVar3, false);
            }
        } else if (i10 == zs.Y1) {
            String str4 = (String) objArr[0];
            jj jjVar4 = MediaController.B().f14482u0;
            if (jjVar4 != null && (str = this.f14503r) != null && str.equals(str4)) {
                a(jjVar4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        float f7;
        File A = hc.A(str);
        if (A.exists()) {
            String absolutePath = A.getAbsolutePath();
            float f10 = 100.0f;
            if (z10) {
                f7 = 600.0f;
            } else {
                f7 = 100.0f;
            }
            if (z10) {
                f10 = 600.0f;
            }
            return hc.K(absolutePath, null, f7, f10, false);
        } else if (z11) {
            this.f14503r = A.getAbsolutePath();
            if (!z10) {
                this.h.o0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.f14503r = null;
            return null;
        }
    }

    public final void f(long j10) {
        long j11;
        int i10;
        int i11;
        int i12;
        this.d = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z10 = !H;
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
        } else {
            jj jjVar = MediaController.B().f14482u0;
            if (jjVar != null && jjVar.I3()) {
                if (tz.N0) {
                    i12 = 2131232554;
                } else {
                    i12 = 2131232555;
                }
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String L0 = cd.L0(2131745340, null);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    if (!TextUtils.isEmpty(L0)) {
                        d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", L0, i12, null));
                        j11 = 2360118;
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            } else {
                j11 = 2360070;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            if (!H) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            d0Var3.c(i10, j10, d(jjVar, z10));
            d0Var3.e = j11;
            if (jjVar != null && jjVar.I3()) {
                int i13 = tz.S0;
                if (i13 != 1) {
                    if (i13 != 2) {
                        i11 = 2131232549;
                    } else {
                        i11 = 2131232553;
                    }
                } else {
                    i11 = 2131232552;
                }
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String L02 = cd.L0(2131746288, null);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    if (!TextUtils.isEmpty(L02)) {
                        d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", L02, i11, null));
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            }
        }
        this.f14500c.C(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.f14500c;
        if (a0Var != null) {
            int i10 = tz.S0;
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            }
            a0Var.E(i11);
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.f14499b = (AudioManager) getSystemService("audio");
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).b(this, zs.f19628i2);
            zs.f(i10).b(this, zs.f19616g2);
            zs.f(i10).b(this, zs.R1);
            zs.f(i10).b(this, zs.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.f14382g1 = new s1(this, 12);
        this.f14500c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.e = Bitmap.createBitmap(i0.L(102.0f), i0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232447);
        drawable.setBounds(0, 0, this.e.getWidth(), this.e.getHeight());
        drawable.draw(new Canvas(this.e));
        this.f14500c.z(new f6.h(this, 1), null);
        this.f14500c.x(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.f14500c;
        if (a0Var != null) {
            a0Var.F(tz.N0 ? 1 : 0);
        }
        registerReceiver(this.f14504s, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.f14504s);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.f14498a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.f14499b.unregisterRemoteControlClient(this.f14498a);
        }
        android.support.v4.media.session.a0 a0Var = this.f14500c;
        if (a0Var != null) {
            a0Var.u();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.f19628i2);
            zs.f(i10).n(this, zs.f19616g2);
            zs.f(i10).n(this, zs.R1);
            zs.f(i10).n(this, zs.Y1);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.B().q(true, true, false, false);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar == null) {
            i0.g3(new a(this, 29));
            return 1;
        }
        if (f14497w) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.f14498a == null) {
                    this.f14499b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.f14498a = remoteControlClient;
                    this.f14499b.registerRemoteControlClient(remoteControlClient);
                }
                this.f14498a.setTransportControlFlags(189);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        a(jjVar, false);
        return 1;
    }
}
