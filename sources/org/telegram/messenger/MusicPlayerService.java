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
public class MusicPlayerService extends Service implements ls {
    public static final boolean f21307w = !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient f21308a;
    public AudioManager f21309b;
    public android.support.v4.media.session.a0 f21310c;
    public android.support.v4.media.session.d0 d;
    public Bitmap f21311e;
    public int f21312f;
    public ImageReceiver h;
    public boolean f21313n;
    public String f21314r;
    public final q0 f21315s = new q0(2);

    public static int b(int i7) {
        if (Build.VERSION.SDK_INT < 31 && as.i()) {
            return i7 & (-100663297);
        }
        return i7;
    }

    public static float d(ij ijVar, boolean z9) {
        if (z9) {
            if (ijVar != null) {
                if (ij.S4(ijVar.f23244k) || ijVar.i4()) {
                    return MediaController.B().f21280p0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public final void a(org.telegram.messenger.ij r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(org.telegram.messenger.ij, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z9, boolean z10) {
        int i7;
        org.telegram.ui.Components.w8 w8Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z9) {
            i7 = 600;
        } else {
            i7 = 100;
        }
        int i10 = i7;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z9) {
                    fileLocation2 = user.photo.photo_big;
                } else {
                    fileLocation2 = user.photo.photo_small;
                }
                if (fileLocation2 != null) {
                    w7.G(p10.f24467s0);
                    File J = w7.J(fileLocation2, null, true, true);
                    if (J.exists()) {
                        float f10 = i10;
                        return gc.K(J.getAbsolutePath(), null, f10, f10, false);
                    } else if (z9) {
                        if (z10) {
                            this.f21314r = w7.r(null, fileLocation2);
                            this.h.q0(hc.l(p10.f24467s0, 0, user), "", null, null, null, 0);
                        } else {
                            this.f21314r = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (z9) {
                    fileLocation = chat.photo.photo_big;
                } else {
                    fileLocation = chat.photo.photo_small;
                }
                if (fileLocation != null) {
                    w7.G(p10.f24467s0);
                    File J2 = w7.J(fileLocation, null, true, true);
                    if (J2.exists()) {
                        float f11 = i10;
                        return gc.K(J2.getAbsolutePath(), null, f11, f11, false);
                    } else if (z9) {
                        if (z10) {
                            this.f21314r = w7.r(null, fileLocation);
                            this.h.q0(hc.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.f21314r = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (z9) {
            return null;
        }
        org.telegram.ui.ActionBar.k6.T(this);
        if (tLObject instanceof TLRPC.User) {
            w8Var = new org.telegram.ui.Components.w8(0, (TLRPC.User) tLObject);
        } else {
            w8Var = new org.telegram.ui.Components.w8((TLRPC.Chat) tLObject);
        }
        w8Var.f39922r = 1;
        float f12 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(g0.L(f12), g0.L(f12), Bitmap.Config.ARGB_8888);
        w8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        w8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        int i11;
        float f10;
        if (i7 == qs.f24995g2) {
            ij ijVar = MediaController.B().f21292u0;
            if (ijVar != null) {
                a(ijVar, false);
            } else {
                stopSelf();
            }
        } else if (i7 == qs.f25007i2) {
            ij ijVar2 = MediaController.B().f21292u0;
            if (ijVar2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * ijVar2.f23231h0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.f21308a;
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
        } else if (i7 == qs.R1) {
            String str3 = (String) objArr[0];
            ij ijVar3 = MediaController.B().f21292u0;
            if (ijVar3 != null && (str2 = this.f21314r) != null && str2.equals(str3)) {
                a(ijVar3, false);
            }
        } else if (i7 == qs.Y1) {
            String str4 = (String) objArr[0];
            ij ijVar4 = MediaController.B().f21292u0;
            if (ijVar4 != null && (str = this.f21314r) != null && str.equals(str4)) {
                a(ijVar4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z9, boolean z10) {
        float f10;
        File A = gc.A(str);
        if (A.exists()) {
            String absolutePath = A.getAbsolutePath();
            float f11 = 100.0f;
            if (z9) {
                f10 = 600.0f;
            } else {
                f10 = 100.0f;
            }
            if (z9) {
                f11 = 600.0f;
            }
            return gc.K(absolutePath, null, f10, f11, false);
        } else if (z10) {
            this.f21314r = A.getAbsolutePath();
            if (!z9) {
                this.h.o0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.f21314r = null;
            return null;
        }
    }

    public final void f(long j3) {
        long j10;
        int i7;
        int i10;
        int i11;
        this.d = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z9 = !H;
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            d0Var.c(6, 0L, 1.0f);
            d0Var.f1769e = 0L;
        } else {
            ij ijVar = MediaController.B().f21292u0;
            if (ijVar != null && ijVar.J3()) {
                if (iz.N0) {
                    i11 = 2131232557;
                } else {
                    i11 = 2131232558;
                }
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String M0 = hd.M0(2131745323, null);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    if (!TextUtils.isEmpty(M0)) {
                        d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i11, null));
                        j10 = 2360118;
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            } else {
                j10 = 2360070;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            if (!H) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            d0Var3.c(i7, j3, d(ijVar, z9));
            d0Var3.f1769e = j10;
            if (ijVar != null && ijVar.J3()) {
                int i12 = iz.S0;
                if (i12 != 1) {
                    if (i12 != 2) {
                        i10 = 2131232552;
                    } else {
                        i10 = 2131232556;
                    }
                } else {
                    i10 = 2131232555;
                }
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String M02 = hd.M0(2131746272, null);
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
        this.f21310c.u(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.f21310c;
        if (a0Var != null) {
            int i7 = iz.S0;
            int i10 = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            a0Var.w(i10);
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.f21309b = (AudioManager) getSystemService("audio");
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).b(this, qs.f25007i2);
            qs.f(i7).b(this, qs.f24995g2);
            qs.f(i7).b(this, qs.R1);
            qs.f(i7).b(this, qs.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.f21192g1 = new p1(this, 13);
        this.f21310c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.f21311e = Bitmap.createBitmap(g0.L(102.0f), g0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232448);
        drawable.setBounds(0, 0, this.f21311e.getWidth(), this.f21311e.getHeight());
        drawable.draw(new Canvas(this.f21311e));
        this.f21310c.s(new i6.g(this, 1), null);
        this.f21310c.r(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.f21310c;
        if (a0Var != null) {
            a0Var.x(iz.N0 ? 1 : 0);
        }
        registerReceiver(this.f21315s, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.f21315s);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.f21308a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.f21309b.unregisterRemoteControlClient(this.f21308a);
        }
        android.support.v4.media.session.a0 a0Var = this.f21310c;
        if (a0Var != null) {
            a0Var.q();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.f25007i2);
            qs.f(i7).n(this, qs.f24995g2);
            qs.f(i7).n(this, qs.R1);
            qs.f(i7).n(this, qs.Y1);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
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
        ij ijVar = MediaController.B().f21292u0;
        if (ijVar == null) {
            g0.h3(new a(this, 29));
            return 1;
        }
        if (f21307w) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.f21308a == null) {
                    this.f21309b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.f21308a = remoteControlClient;
                    this.f21309b.registerRemoteControlClient(remoteControlClient);
                }
                this.f21308a.setTransportControlFlags(189);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        a(ijVar, false);
        return 1;
    }
}
