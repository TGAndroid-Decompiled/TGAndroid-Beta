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
public class MusicPlayerService extends Service implements fn7 {
    public static final boolean s;
    public static rx6 w;
    public RemoteControlClient a;
    public AudioManager b;
    public f c;
    public Bitmap d;
    public int e;
    public ImageReceiver f;
    public boolean h;
    public String n;
    public final ur r = new ur((byte) 2);

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 && !TextUtils.isEmpty(hl.j1("ro.miui.ui.version.code"))) {
            z = true;
        } else {
            z = false;
        }
        s = z;
    }

    public static int b(int i) {
        if (Build.VERSION.SDK_INT < 31 && f3f.b()) {
            return i & (-100663297);
        }
        return i;
    }

    public static float d(r47 r47Var, boolean z) {
        if (z) {
            if (r47Var != null) {
                if (r47.Q4(r47Var.k) || r47Var.g4()) {
                    return MediaController.z().q0;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public static void g() {
        if (w != null) {
            int i = xea.O0;
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            w.u0(i2);
        }
    }

    public final void a(defpackage.r47 r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.a(r47, boolean):void");
    }

    public final Bitmap c(TLObject tLObject, boolean z, boolean z2) {
        int i;
        rb0 rb0Var;
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
                    xb4.G(yac.t0);
                    File J = xb4.J(fileLocation2, null, true, true);
                    if (J.exists()) {
                        float f = i2;
                        return in5.G(J.getAbsolutePath(), null, f, f, false);
                    } else if (z) {
                        if (z2) {
                            this.n = xb4.r(null, fileLocation2);
                            this.f.d0(jn5.l(yac.t0, 0, user), "", null, null, null, 0);
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
                    xb4.G(yac.t0);
                    File J2 = xb4.J(fileLocation, null, true, true);
                    if (J2.exists()) {
                        float f2 = i2;
                        return in5.G(J2.getAbsolutePath(), null, f2, f2, false);
                    } else if (z) {
                        if (z2) {
                            this.n = xb4.r(null, fileLocation);
                            this.f.d0(jn5.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        if (z) {
            return null;
        }
        aob.S(this);
        if (tLObject instanceof TLRPC.User) {
            rb0Var = new rb0(0, (TLRPC.User) tLObject);
        } else {
            rb0Var = new rb0((TLRPC.Chat) tLObject);
        }
        rb0Var.r = 1;
        float f3 = i2;
        Bitmap createBitmap = Bitmap.createBitmap(hl.L(f3), hl.L(f3), Bitmap.Config.ARGB_8888);
        rb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        rb0Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        int i3;
        float f;
        if (i == jn7.g2) {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null) {
                a(r47Var, false);
            } else {
                stopSelf();
            }
        } else if (i == jn7.i2) {
            r47 r47Var2 = MediaController.z().v0;
            if (r47Var2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * r47Var2.j0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.a;
                if (remoteControlClient != null) {
                    if (MediaController.z().G()) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                    }
                    if (MediaController.z().G()) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    remoteControlClient.setPlaybackState(i3, round, f);
                }
            }
        } else if (i == jn7.R1) {
            String str3 = (String) objArr[0];
            r47 r47Var3 = MediaController.z().v0;
            if (r47Var3 != null && (str2 = this.n) != null && str2.equals(str3)) {
                a(r47Var3, false);
            }
        } else if (i == jn7.Y1) {
            String str4 = (String) objArr[0];
            r47 r47Var4 = MediaController.z().v0;
            if (r47Var4 != null && (str = this.n) != null && str.equals(str4)) {
                a(r47Var4, false);
            }
        }
    }

    public final Bitmap e(String str, boolean z, boolean z2) {
        float f;
        File w2 = in5.w(str);
        if (w2.exists()) {
            String absolutePath = w2.getAbsolutePath();
            if (z) {
                f = 600.0f;
            } else {
                f = 100.0f;
            }
            return in5.G(absolutePath, null, f, f, false);
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
        boolean G = MediaController.z().G();
        boolean z = !G;
        if (MediaController.z().B0) {
            f fVar = this.c;
            fVar.c(6, 0L, 1.0f);
            fVar.e = 0L;
        } else {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null && r47Var.I3()) {
                if (xea.J0) {
                    i3 = 2131232573;
                } else {
                    i3 = 2131232574;
                }
                f fVar2 = this.c;
                String M0 = ob6.M0(2131745050, null);
                if (!TextUtils.isEmpty(M0)) {
                    fVar2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i3, null));
                    j2 = 2360118;
                } else {
                    lq5.j("You must specify a name to build a CustomAction");
                    return;
                }
            } else {
                j2 = 2360070;
            }
            f fVar3 = this.c;
            if (!G) {
                i = 3;
            } else {
                i = 2;
            }
            fVar3.c(i, j, d(r47Var, z));
            fVar3.e = j2;
            if (r47Var != null && r47Var.I3()) {
                int i4 = xea.O0;
                if (i4 != 1) {
                    if (i4 != 2) {
                        i2 = 2131232568;
                    } else {
                        i2 = 2131232572;
                    }
                } else {
                    i2 = 2131232571;
                }
                f fVar4 = this.c;
                String M02 = ob6.M0(2131746000, null);
                if (!TextUtils.isEmpty(M02)) {
                    fVar4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i2, null));
                } else {
                    lq5.j("You must specify a name to build a CustomAction");
                    return;
                }
            }
        }
        w.s0(this.c.b());
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        this.b = (AudioManager) getSystemService("audio");
        for (int i = 0; i < 4; i++) {
            jn7.f(i).a(this, jn7.i2);
            jn7.f(i).a(this, jn7.g2);
            jn7.f(i).a(this, jn7.R1);
            jn7.f(i).a(this, jn7.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f = imageReceiver;
        imageReceiver.h1 = new bm6(this, (byte) 17);
        if (w == null) {
            w = new rx6(getApplicationContext(), "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.c = new f();
        this.d = Bitmap.createBitmap(hl.L(102.0f), hl.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(2131232464);
        drawable.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
        drawable.draw(new Canvas(this.d));
        w.p0(new oj7(this, (byte) 0), null);
        w.n0(true);
        g();
        rx6 rx6Var = w;
        if (rx6Var != null) {
            rx6Var.v0(xea.J0 ? 1 : 0);
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
        rx6 rx6Var = w;
        if (rx6Var != null) {
            rx6Var.p0(null, null);
            w.n0(false);
        }
        for (int i = 0; i < 4; i++) {
            jn7.f(i).n(this, jn7.i2);
            jn7.f(i).n(this, jn7.g2);
            jn7.f(i).n(this, jn7.R1);
            jn7.f(i).n(this, jn7.Y1);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.z().m(true, true, false, false);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null) {
            hl.c3(new ge7(this, (byte) 3));
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
                cc4.g(e2, true);
            }
        }
        a(r47Var, false);
        return 1;
    }
}
