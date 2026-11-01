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
public class MusicPlayerService extends Service implements vs {
    public static final boolean f14498w = !TextUtils.isEmpty(i0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient f14499a;
    public AudioManager f14500b;
    public android.support.v4.media.session.a0 f14501c;
    public android.support.v4.media.session.d0 d;
    public Bitmap e;
    public int f14502f;
    public ImageReceiver h;
    public boolean f14503n;
    public String f14504r;
    public final t0 f14505s = new t0(2);

    public static int b(int i10) {
        if (Build.VERSION.SDK_INT < 31 && d6.i()) {
            return i10 & (-100663297);
        }
        return i10;
    }

    public static float d(kj kjVar, boolean z10) {
        if (z10) {
            if (kjVar != null) {
                if (kj.R4(kjVar.f16690k) || kjVar.h4()) {
                    return MediaController.B().f14471p0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public final void a(org.telegram.messenger.kj r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(org.telegram.messenger.kj, boolean):void");
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
                    b8.G(e20.f15506s0);
                    File K = b8.K(fileLocation2, null, true, true);
                    if (K.exists()) {
                        float f7 = i11;
                        return ic.K(K.getAbsolutePath(), null, f7, f7, false);
                    } else if (z10) {
                        if (z11) {
                            this.f14504r = b8.r(null, fileLocation2);
                            this.h.q0(jc.l(e20.f15506s0, 0, user), "", null, null, null, 0);
                        } else {
                            this.f14504r = null;
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
                    b8.G(e20.f15506s0);
                    File K2 = b8.K(fileLocation, null, true, true);
                    if (K2.exists()) {
                        float f10 = i11;
                        return ic.K(K2.getAbsolutePath(), null, f10, f10, false);
                    } else if (z10) {
                        if (z11) {
                            this.f14504r = b8.r(null, fileLocation);
                            this.h.q0(jc.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.f14504r = null;
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
        r8Var.f29929r = 1;
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
        if (i10 == at.f14712g2) {
            kj kjVar = MediaController.B().f14483u0;
            if (kjVar != null) {
                a(kjVar, false);
            } else {
                stopSelf();
            }
        } else if (i10 == at.f14724i2) {
            kj kjVar2 = MediaController.B().f14483u0;
            if (kjVar2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * kjVar2.f16679h0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.f14499a;
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
        } else if (i10 == at.R1) {
            String str3 = (String) objArr[0];
            kj kjVar3 = MediaController.B().f14483u0;
            if (kjVar3 != null && (str2 = this.f14504r) != null && str2.equals(str3)) {
                a(kjVar3, false);
            }
        } else if (i10 == at.Y1) {
            String str4 = (String) objArr[0];
            kj kjVar4 = MediaController.B().f14483u0;
            if (kjVar4 != null && (str = this.f14504r) != null && str.equals(str4)) {
                a(kjVar4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        float f7;
        File A = ic.A(str);
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
            return ic.K(absolutePath, null, f7, f10, false);
        } else if (z11) {
            this.f14504r = A.getAbsolutePath();
            if (!z10) {
                this.h.o0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.f14504r = null;
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
            kj kjVar = MediaController.B().f14483u0;
            if (kjVar != null && kjVar.I3()) {
                if (uz.N0) {
                    i12 = 2131232554;
                } else {
                    i12 = 2131232555;
                }
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String L0 = dd.L0(2131745340, null);
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
            d0Var3.c(i10, j10, d(kjVar, z10));
            d0Var3.e = j11;
            if (kjVar != null && kjVar.I3()) {
                int i13 = uz.S0;
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
                String L02 = dd.L0(2131746288, null);
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
        this.f14501c.C(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.f14501c;
        if (a0Var != null) {
            int i10 = uz.S0;
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
        this.f14500b = (AudioManager) getSystemService("audio");
        for (int i10 = 0; i10 < 4; i10++) {
            at.f(i10).b(this, at.f14724i2);
            at.f(i10).b(this, at.f14712g2);
            at.f(i10).b(this, at.R1);
            at.f(i10).b(this, at.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.f14383g1 = new s1(this, 12);
        this.f14501c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.e = Bitmap.createBitmap(i0.L(102.0f), i0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232447);
        drawable.setBounds(0, 0, this.e.getWidth(), this.e.getHeight());
        drawable.draw(new Canvas(this.e));
        this.f14501c.z(new f6.h(this, 1), null);
        this.f14501c.x(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.f14501c;
        if (a0Var != null) {
            a0Var.F(uz.N0 ? 1 : 0);
        }
        registerReceiver(this.f14505s, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.f14505s);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.f14499a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.f14500b.unregisterRemoteControlClient(this.f14499a);
        }
        android.support.v4.media.session.a0 a0Var = this.f14501c;
        if (a0Var != null) {
            a0Var.u();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            at.f(i10).n(this, at.f14724i2);
            at.f(i10).n(this, at.f14712g2);
            at.f(i10).n(this, at.R1);
            at.f(i10).n(this, at.Y1);
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
        kj kjVar = MediaController.B().f14483u0;
        if (kjVar == null) {
            i0.g3(new a(this, 29));
            return 1;
        }
        if (f14498w) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.f14499a == null) {
                    this.f14500b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.f14499a = remoteControlClient;
                    this.f14500b.registerRemoteControlClient(remoteControlClient);
                }
                this.f14499a.setTransportControlFlags(189);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        a(kjVar, false);
        return 1;
    }
}
