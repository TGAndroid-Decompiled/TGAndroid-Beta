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
public class MusicPlayerService extends Service implements cs {
    public static final boolean f21361w = !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient f21362a;
    public AudioManager f21363b;
    public android.support.v4.media.session.a0 f21364c;
    public android.support.v4.media.session.d0 d;
    public Bitmap f21365e;
    public int f21366f;
    public ImageReceiver h;
    public boolean f21367n;
    public String f21368r;
    public final q0 f21369s = new q0(2);

    public static int b(int i3) {
        if (Build.VERSION.SDK_INT < 31 && sr.i()) {
            return i3 & (-100663297);
        }
        return i3;
    }

    public static float d(zi ziVar, boolean z10) {
        if (z10) {
            if (ziVar != null) {
                if (zi.S4(ziVar.f26868k) || ziVar.i4()) {
                    return MediaController.B().f21336q0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public final void a(org.telegram.messenger.zi r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(org.telegram.messenger.zi, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z10, boolean z11) {
        int i3;
        org.telegram.ui.Components.u8 u8Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z10) {
            i3 = 600;
        } else {
            i3 = 100;
        }
        int i10 = i3;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z10) {
                    fileLocation2 = user.photo.photo_big;
                } else {
                    fileLocation2 = user.photo.photo_small;
                }
                if (fileLocation2 != null) {
                    w7.G(h10.f22829t0);
                    File K = w7.K(fileLocation2, null, true, true);
                    if (K.exists()) {
                        float f10 = i10;
                        return zb.K(K.getAbsolutePath(), null, f10, f10, false);
                    } else if (z10) {
                        if (z11) {
                            this.f21368r = w7.r(null, fileLocation2);
                            this.h.q0(ac.l(h10.f22829t0, 0, user), "", null, null, null, 0);
                        } else {
                            this.f21368r = null;
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
                    w7.G(h10.f22829t0);
                    File K2 = w7.K(fileLocation, null, true, true);
                    if (K2.exists()) {
                        float f11 = i10;
                        return zb.K(K2.getAbsolutePath(), null, f11, f11, false);
                    } else if (z10) {
                        if (z11) {
                            this.f21368r = w7.r(null, fileLocation);
                            this.h.q0(ac.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.f21368r = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.k6.T(this);
        if (tLObject instanceof TLRPC.User) {
            u8Var = new org.telegram.ui.Components.u8(0, (TLRPC.User) tLObject);
        } else {
            u8Var = new org.telegram.ui.Components.u8((TLRPC.Chat) tLObject);
        }
        u8Var.f38693r = 1;
        float f12 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(g0.L(f12), g0.L(f12), Bitmap.Config.ARGB_8888);
        u8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        u8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        String str2;
        int i11;
        float f10;
        if (i3 == hs.f23233g2) {
            zi ziVar = MediaController.B().f21348v0;
            if (ziVar != null) {
                a(ziVar, false);
            } else {
                stopSelf();
            }
        } else if (i3 == hs.f23245i2) {
            zi ziVar2 = MediaController.B().f21348v0;
            if (ziVar2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * ziVar2.f26855h0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.f21362a;
                if (remoteControlClient != null) {
                    if (MediaController.B().H()) {
                        i11 = 2;
                    } else {
                        i11 = 3;
                    }
                    if (MediaController.B().H()) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    remoteControlClient.setPlaybackState(i11, round, f10);
                }
            }
        } else if (i3 == hs.R1) {
            String str3 = (String) objArr[0];
            zi ziVar3 = MediaController.B().f21348v0;
            if (ziVar3 != null && (str2 = this.f21368r) != null && str2.equals(str3)) {
                a(ziVar3, false);
            }
        } else if (i3 == hs.Y1) {
            String str4 = (String) objArr[0];
            zi ziVar4 = MediaController.B().f21348v0;
            if (ziVar4 != null && (str = this.f21368r) != null && str.equals(str4)) {
                a(ziVar4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        float f10;
        File A = zb.A(str);
        if (A.exists()) {
            String absolutePath = A.getAbsolutePath();
            float f11 = 100.0f;
            if (z10) {
                f10 = 600.0f;
            } else {
                f10 = 100.0f;
            }
            if (z10) {
                f11 = 600.0f;
            }
            return zb.K(absolutePath, null, f10, f11, false);
        } else if (z11) {
            this.f21368r = A.getAbsolutePath();
            if (!z10) {
                this.h.o0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.f21368r = null;
            return null;
        }
    }

    public final void f(long j10) {
        long j11;
        int i3;
        int i10;
        int i11;
        this.d = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z10 = !H;
        if (MediaController.B().B0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            d0Var.c(6, 0L, 1.0f);
            d0Var.f1192e = 0L;
        } else {
            zi ziVar = MediaController.B().f21348v0;
            if (ziVar != null && ziVar.J3()) {
                if (az.N0) {
                    i11 = 2131232555;
                } else {
                    i11 = 2131232556;
                }
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String M0 = bd.M0(2131745332, null);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    if (!TextUtils.isEmpty(M0)) {
                        d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i11, null));
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
                i3 = 3;
            } else {
                i3 = 2;
            }
            d0Var3.c(i3, j10, d(ziVar, z10));
            d0Var3.f1192e = j11;
            if (ziVar != null && ziVar.J3()) {
                int i12 = az.S0;
                if (i12 != 1) {
                    if (i12 != 2) {
                        i10 = 2131232550;
                    } else {
                        i10 = 2131232554;
                    }
                } else {
                    i10 = 2131232553;
                }
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String M02 = bd.M0(2131746281, null);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    if (!TextUtils.isEmpty(M02)) {
                        d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i10, null));
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            }
        }
        this.f21364c.t(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.f21364c;
        if (a0Var != null) {
            int i3 = az.S0;
            int i10 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            a0Var.v(i10);
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.f21363b = (AudioManager) getSystemService("audio");
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).b(this, hs.f23245i2);
            hs.f(i3).b(this, hs.f23233g2);
            hs.f(i3).b(this, hs.R1);
            hs.f(i3).b(this, hs.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.f21247h1 = new p1(this, 12);
        this.f21364c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.f21365e = Bitmap.createBitmap(g0.L(102.0f), g0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232448);
        drawable.setBounds(0, 0, this.f21365e.getWidth(), this.f21365e.getHeight());
        drawable.draw(new Canvas(this.f21365e));
        this.f21364c.r(new h6.g(this, 1), null);
        this.f21364c.q(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.f21364c;
        if (a0Var != null) {
            a0Var.w(az.N0 ? 1 : 0);
        }
        registerReceiver(this.f21369s, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.f21369s);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.f21362a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.f21363b.unregisterRemoteControlClient(this.f21362a);
        }
        android.support.v4.media.session.a0 a0Var = this.f21364c;
        if (a0Var != null) {
            a0Var.o();
        }
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).n(this, hs.f23245i2);
            hs.f(i3).n(this, hs.f23233g2);
            hs.f(i3).n(this, hs.R1);
            hs.f(i3).n(this, hs.Y1);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.B().q(true, true, false, false);
                    return 2;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar == null) {
            g0.h3(new a(this, 28));
            return 1;
        }
        if (f21361w) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.f21362a == null) {
                    this.f21363b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.f21362a = remoteControlClient;
                    this.f21363b.registerRemoteControlClient(remoteControlClient);
                }
                this.f21362a.setTransportControlFlags(189);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        a(ziVar, false);
        return 1;
    }
}
