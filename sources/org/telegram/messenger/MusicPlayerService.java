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
import android.support.v4.media.session.f;
import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class MusicPlayerService extends Service implements gk7 {
    public static final boolean s;
    public static mv6 w;
    public RemoteControlClient a;
    public AudioManager b;
    public f c;
    public Bitmap d;
    public int e;
    public ImageReceiver f;
    public boolean h;
    public String n;
    public final tr r = new tr((byte) 2);

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 && !TextUtils.isEmpty(gl.j1("ro.miui.ui.version.code"))) {
            z = true;
        } else {
            z = false;
        }
        s = z;
    }

    public static int b(int i) {
        if (Build.VERSION.SDK_INT < 31 && nye.b()) {
            return i & (-100663297);
        }
        return i;
    }

    public static float d(k27 k27Var, boolean z) {
        if (z) {
            if (k27Var != null) {
                if (k27.Q4(k27Var.k) || k27Var.g4()) {
                    return MediaController.w().q0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public static void g() {
        if (w != null) {
            int i = gba.P0;
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            w.p0(i2);
        }
    }

    public final void a(defpackage.k27 r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(k27, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z, boolean z2) {
        int i;
        pb0 pb0Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z) {
            i = 600;
        } else {
            i = 100;
        }
        int i2 = i;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (z) {
                    fileLocation2 = userProfilePhoto.photo_big;
                } else {
                    fileLocation2 = userProfilePhoto.photo_small;
                }
                if (fileLocation2 != null) {
                    ba4.G(y6c.t0);
                    File J = ba4.J(fileLocation2, null, true, true);
                    if (J.exists()) {
                        float f = i2;
                        return fl5.G(J.getAbsolutePath(), null, f, f, false);
                    } else if (z) {
                        if (z2) {
                            this.n = ba4.r(null, fileLocation2);
                            this.f.d0(gl5.l(y6c.t0, 0, user), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (z) {
                    fileLocation = chatPhoto.photo_big;
                } else {
                    fileLocation = chatPhoto.photo_small;
                }
                if (fileLocation != null) {
                    ba4.G(y6c.t0);
                    File J2 = ba4.J(fileLocation, null, true, true);
                    if (J2.exists()) {
                        float f2 = i2;
                        return fl5.G(J2.getAbsolutePath(), null, f2, f2, false);
                    } else if (z) {
                        if (z2) {
                            this.n = ba4.r(null, fileLocation);
                            this.f.d0(gl5.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        if (z) {
            return null;
        }
        bkb.S(this);
        if (tLObject instanceof TLRPC.User) {
            pb0Var = new pb0(0, (TLRPC.User) tLObject);
        } else {
            pb0Var = new pb0((TLRPC.Chat) tLObject);
        }
        pb0Var.r = 1;
        float f3 = i2;
        Bitmap createBitmap = Bitmap.createBitmap(gl.L(f3), gl.L(f3), Bitmap.Config.ARGB_8888);
        pb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        pb0Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        int i3;
        float f;
        if (i == kk7.f2) {
            k27 k27Var = MediaController.w().v0;
            if (k27Var != null) {
                a(k27Var, false);
            } else {
                stopSelf();
            }
        } else if (i == kk7.h2) {
            k27 k27Var2 = MediaController.w().v0;
            if (k27Var2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * k27Var2.j0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.a;
                if (remoteControlClient != null) {
                    if (MediaController.w().C()) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                    }
                    if (MediaController.w().C()) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    remoteControlClient.setPlaybackState(i3, round, f);
                }
            }
        } else if (i == kk7.Q1) {
            String str3 = (String) objArr[0];
            k27 k27Var3 = MediaController.w().v0;
            if (k27Var3 != null && (str2 = this.n) != null && str2.equals(str3)) {
                a(k27Var3, false);
            }
        } else if (i == kk7.X1) {
            String str4 = (String) objArr[0];
            k27 k27Var4 = MediaController.w().v0;
            if (k27Var4 != null && (str = this.n) != null && str.equals(str4)) {
                a(k27Var4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z, boolean z2) {
        float f;
        File w2 = fl5.w(str);
        if (w2.exists()) {
            String absolutePath = w2.getAbsolutePath();
            if (z) {
                f = 600.0f;
            } else {
                f = 100.0f;
            }
            return fl5.G(absolutePath, null, f, f, false);
        } else if (z2) {
            this.n = w2.getAbsolutePath();
            if (!z) {
                this.f.e0(str, "48_48", null, null, 0L);
            }
            return null;
        } else {
            this.n = null;
            return null;
        }
    }

    public final void f(long j) {
        long j2;
        int i;
        int i2;
        int i3;
        this.c = new f();
        boolean C = MediaController.w().C();
        boolean z = !C;
        if (MediaController.w().B0) {
            f fVar = this.c;
            fVar.c(6, 0L, 1.0f);
            fVar.e = 0L;
        } else {
            k27 k27Var = MediaController.w().v0;
            if (k27Var != null && k27Var.I3()) {
                if (gba.K0) {
                    i3 = 2131232562;
                } else {
                    i3 = 2131232563;
                }
                f fVar2 = this.c;
                String M0 = k96.M0(2131745130, null);
                if (!TextUtils.isEmpty(M0)) {
                    fVar2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i3, null));
                    j2 = 2360118;
                } else {
                    w26.j("You must specify a name to build a CustomAction");
                    return;
                }
            } else {
                j2 = 2360070;
            }
            f fVar3 = this.c;
            if (!C) {
                i = 3;
            } else {
                i = 2;
            }
            fVar3.c(i, j, d(k27Var, z));
            fVar3.e = j2;
            if (k27Var != null && k27Var.I3()) {
                int i4 = gba.P0;
                if (i4 != 1) {
                    if (i4 != 2) {
                        i2 = 2131232557;
                    } else {
                        i2 = 2131232561;
                    }
                } else {
                    i2 = 2131232560;
                }
                f fVar4 = this.c;
                String M02 = k96.M0(2131746080, null);
                if (!TextUtils.isEmpty(M02)) {
                    fVar4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i2, null));
                } else {
                    w26.j("You must specify a name to build a CustomAction");
                    return;
                }
            }
        }
        w.n0(this.c.b());
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.b = (AudioManager) getSystemService("audio");
        for (int i = 0; i < 4; i++) {
            kk7.f(i).a(this, kk7.h2);
            kk7.f(i).a(this, kk7.f2);
            kk7.f(i).a(this, kk7.Q1);
            kk7.f(i).a(this, kk7.X1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f = imageReceiver;
        imageReceiver.h1 = new im6(this, (byte) 13);
        if (w == null) {
            w = new mv6(getApplicationContext(), "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.c = new f();
        this.d = Bitmap.createBitmap(gl.L(102.0f), gl.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232453);
        drawable.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
        drawable.draw(new Canvas(this.d));
        w.k0(new eh7(this, (byte) 0), null);
        w.i0(true);
        g();
        mv6 mv6Var = w;
        if (mv6Var != null) {
            mv6Var.q0(gba.K0 ? 1 : 0);
        }
        registerReceiver(this.r, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public final void onDestroy() {
        unregisterReceiver(this.r);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.b.unregisterRemoteControlClient(this.a);
        }
        mv6 mv6Var = w;
        if (mv6Var != null) {
            mv6Var.k0(null, null);
            w.i0(false);
        }
        for (int i = 0; i < 4; i++) {
            kk7.f(i).n(this, kk7.h2);
            kk7.f(i).n(this, kk7.f2);
            kk7.f(i).n(this, kk7.Q1);
            kk7.f(i).n(this, kk7.X1);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.w().l(true, true, false, false);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        k27 k27Var = MediaController.w().v0;
        if (k27Var == null) {
            gl.d3(new vl6(this, (byte) 20));
            return 1;
        }
        if (s) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.a == null) {
                    this.b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.a = remoteControlClient;
                    this.b.registerRemoteControlClient(remoteControlClient);
                }
                this.a.setTransportControlFlags(189);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        a(k27Var, false);
        return 1;
    }
}
