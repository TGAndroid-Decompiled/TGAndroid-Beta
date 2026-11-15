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
public class MusicPlayerService extends Service implements is {
    public static final boolean f22390s;
    public static android.support.v4.media.session.a0 f22391w;
    public RemoteControlClient f22392a;
    public AudioManager f22393b;
    public android.support.v4.media.session.d0 f22394c;
    public Bitmap d;
    public int f22395e;
    public ImageReceiver f22396f;
    public boolean h;
    public String f22397n;
    public final q0 f22398r = new q0(2);

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 29 && !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.code"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        f22390s = z10;
    }

    public static int b(int i7) {
        if (Build.VERSION.SDK_INT < 31 && b6.i()) {
            return i7 & (-100663297);
        }
        return i7;
    }

    public static float d(gj gjVar, boolean z10) {
        if (z10) {
            if (gjVar != null) {
                if (gj.R4(gjVar.f23819k) || gjVar.h4()) {
                    return MediaController.B().f22365q0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public static void g() {
        if (f22391w != null) {
            int i7 = gz.S0;
            int i10 = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            f22391w.v(i10);
        }
    }

    public final void a(org.telegram.messenger.gj r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(org.telegram.messenger.gj, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z10, boolean z11) {
        int i7;
        org.telegram.ui.Components.t8 t8Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z10) {
            i7 = 600;
        } else {
            i7 = 100;
        }
        int i10 = i7;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z10) {
                    fileLocation2 = user.photo.photo_big;
                } else {
                    fileLocation2 = user.photo.photo_small;
                }
                if (fileLocation2 != null) {
                    w7.G(m10.f24940t0);
                    File J = w7.J(fileLocation2, null, true, true);
                    if (J.exists()) {
                        float f10 = i10;
                        return fc.K(J.getAbsolutePath(), null, f10, f10, false);
                    } else if (z10) {
                        if (z11) {
                            this.f22397n = w7.r(null, fileLocation2);
                            this.f22396f.q0(gc.l(m10.f24940t0, 0, user), "", null, null, null, 0);
                        } else {
                            this.f22397n = null;
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
                    w7.G(m10.f24940t0);
                    File J2 = w7.J(fileLocation, null, true, true);
                    if (J2.exists()) {
                        float f11 = i10;
                        return fc.K(J2.getAbsolutePath(), null, f11, f11, false);
                    } else if (z10) {
                        if (z11) {
                            this.f22397n = w7.r(null, fileLocation);
                            this.f22396f.q0(gc.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.f22397n = null;
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
        org.telegram.ui.ActionBar.j6.T(this);
        if (tLObject instanceof TLRPC.User) {
            t8Var = new org.telegram.ui.Components.t8(0, (TLRPC.User) tLObject);
        } else {
            t8Var = new org.telegram.ui.Components.t8((TLRPC.Chat) tLObject);
        }
        t8Var.f39600r = 1;
        float f12 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(g0.L(f12), g0.L(f12), Bitmap.Config.ARGB_8888);
        t8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        t8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        int i11;
        float f10;
        if (i7 == ns.f25501g2) {
            gj gjVar = MediaController.B().f22377v0;
            if (gjVar != null) {
                a(gjVar, false);
            } else {
                stopSelf();
            }
        } else if (i7 == ns.f25513i2) {
            gj gjVar2 = MediaController.B().f22377v0;
            if (gjVar2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * gjVar2.f23816j0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.f22392a;
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
        } else if (i7 == ns.R1) {
            String str3 = (String) objArr[0];
            gj gjVar3 = MediaController.B().f22377v0;
            if (gjVar3 != null && (str2 = this.f22397n) != null && str2.equals(str3)) {
                a(gjVar3, false);
            }
        } else if (i7 == ns.Y1) {
            String str4 = (String) objArr[0];
            gj gjVar4 = MediaController.B().f22377v0;
            if (gjVar4 != null && (str = this.f22397n) != null && str.equals(str4)) {
                a(gjVar4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        float f10;
        File A = fc.A(str);
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
            return fc.K(absolutePath, null, f10, f11, false);
        } else if (z11) {
            this.f22397n = A.getAbsolutePath();
            if (!z10) {
                this.f22396f.o0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.f22397n = null;
            return null;
        }
    }

    public final void f(long j3) {
        long j10;
        int i7;
        int i10;
        int i11;
        this.f22394c = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z10 = !H;
        if (MediaController.B().B0) {
            android.support.v4.media.session.d0 d0Var = this.f22394c;
            d0Var.c(6, 0L, 1.0f);
            d0Var.f1719e = 0L;
        } else {
            gj gjVar = MediaController.B().f22377v0;
            if (gjVar != null && gjVar.I3()) {
                if (gz.N0) {
                    i11 = 2131232558;
                } else {
                    i11 = 2131232559;
                }
                android.support.v4.media.session.d0 d0Var2 = this.f22394c;
                String M0 = hd.M0(2131745322, null);
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
            android.support.v4.media.session.d0 d0Var3 = this.f22394c;
            if (!H) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            d0Var3.c(i7, j3, d(gjVar, z10));
            d0Var3.f1719e = j10;
            if (gjVar != null && gjVar.I3()) {
                int i12 = gz.S0;
                if (i12 != 1) {
                    if (i12 != 2) {
                        i10 = 2131232553;
                    } else {
                        i10 = 2131232557;
                    }
                } else {
                    i10 = 2131232556;
                }
                android.support.v4.media.session.d0 d0Var4 = this.f22394c;
                String M02 = hd.M0(2131746273, null);
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
        f22391w.t(this.f22394c.b());
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.f22393b = (AudioManager) getSystemService("audio");
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).b(this, ns.f25513i2);
            ns.f(i7).b(this, ns.f25501g2);
            ns.f(i7).b(this, ns.R1);
            ns.f(i7).b(this, ns.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f22396f = imageReceiver;
        imageReceiver.f22276h1 = new j1(this, 13);
        if (f22391w == null) {
            f22391w = new android.support.v4.media.session.a0(getApplicationContext(), "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.f22394c = new android.support.v4.media.session.d0();
        this.d = Bitmap.createBitmap(g0.L(102.0f), g0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232449);
        drawable.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
        drawable.draw(new Canvas(this.d));
        f22391w.r(new i6.g(this, 1), null);
        f22391w.q(true);
        g();
        android.support.v4.media.session.a0 a0Var = f22391w;
        if (a0Var != null) {
            a0Var.w(gz.N0 ? 1 : 0);
        }
        registerReceiver(this.f22398r, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.f22398r);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.f22392a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.f22393b.unregisterRemoteControlClient(this.f22392a);
        }
        android.support.v4.media.session.a0 a0Var = f22391w;
        if (a0Var != null) {
            a0Var.r(null, null);
            f22391w.q(false);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).n(this, ns.f25513i2);
            ns.f(i7).n(this, ns.f25501g2);
            ns.f(i7).n(this, ns.R1);
            ns.f(i7).n(this, ns.Y1);
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
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar == null) {
            g0.h3(new a(this, 29));
            return 1;
        }
        if (f22390s) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.f22392a == null) {
                    this.f22393b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.f22392a = remoteControlClient;
                    this.f22393b.registerRemoteControlClient(remoteControlClient);
                }
                this.f22392a.setTransportControlFlags(189);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        a(gjVar, false);
        return 1;
    }
}
