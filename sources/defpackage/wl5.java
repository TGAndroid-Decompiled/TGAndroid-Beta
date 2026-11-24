package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class wl5 implements gk7 {
    public k27 E;
    public String F;
    public boolean G;
    public boolean I;
    public final boolean J;
    public TLRPC.User M;
    public TLRPC.InputFile N;
    public TLRPC.InputFile O;
    public TLRPC.VideoSize P;
    public double Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public byte V;
    public final byte W;
    public float X;
    public d a;
    public vl5 b;
    public x02 c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = y6c.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public wl5(int i, boolean z, boolean z2) {
        this.R = z;
        this.J = z2;
        this.W = i;
    }

    public final void a() {
        this.U = true;
        String str = this.w;
        int i = this.d;
        if (str != null) {
            ba4.G(i).b(this.w, false);
        }
        if (this.x != null) {
            ba4.G(i).b(this.x, false);
        }
        vl5 vl5Var = this.b;
        if (vl5Var != null) {
            vl5Var.T();
        }
    }

    public final void b() {
        this.w = null;
        this.x = null;
        this.y = null;
        this.E = null;
        if (this.G) {
            this.e.g0(null);
            this.a = null;
            this.b = null;
        }
    }

    public final void c() {
        this.U = false;
        if (this.w == null && this.x == null && this.E == null) {
            this.a = null;
            this.b = null;
        } else {
            this.G = true;
        }
        x02 x02Var = this.c;
        if (x02Var != null) {
            x02Var.I();
            this.c.e1();
        }
    }

    public final void d() {
        byte b;
        wf0 wf0Var;
        boolean z;
        d dVar = this.a;
        if (dVar != null && dVar.getParentActivity() != null) {
            x02 x02Var = this.c;
            if (x02Var == null) {
                x02 x02Var2 = new x02(this.a.getParentActivity(), this.a, this.S, this.T);
                this.c = x02Var2;
                if (this.R) {
                    b = 2;
                } else {
                    b = 1;
                }
                vl5 vl5Var = this.b;
                if (vl5Var != null && vl5Var.x()) {
                    vl5 vl5Var2 = this.b;
                    Objects.requireNonNull(vl5Var2);
                    wf0Var = new wf0(vl5Var2, (byte) 2);
                } else {
                    wf0Var = null;
                }
                x02Var2.N2 = b;
                x02Var2.O2 = wf0Var;
                x02Var2.P2 = false;
                p02 p02Var = x02Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var2.d2;
                if (p02Var == null || p02Var == chatAttachAlertPhotoLayout) {
                    x02Var2.u3.setVisibility(8);
                }
                byte b2 = x02Var2.N2;
                TextView textView = x02Var2.g3;
                if (b2 == 2) {
                    textView.setText(k96.M0(2131752109, null));
                } else {
                    textView.setText(k96.M0(2131752111, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    x02 x02Var3 = chatAttachAlertPhotoLayout.b;
                    if (x02Var3.N2 != 0 && !x02Var3.z1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    chatAttachAlertPhotoLayout.h1 = z;
                }
                x02Var = this.c;
                x02Var.W3 = new sl5(this);
                x02Var.O1 = this;
            }
            TextView textView2 = x02Var.g3;
            byte b3 = this.V;
            if (b3 == 1) {
                textView2.setText(k96.a0("SetPhotoFor", null, 2131745326, this.M.first_name));
            } else if (b3 == 2) {
                textView2.setText(k96.a0("SuggestPhotoFor", null, 2131744165, this.M.first_name));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vl5 vl5Var;
        d dVar;
        String str;
        int i3 = kk7.V1;
        int i4 = kk7.U1;
        int i5 = this.d;
        int i6 = kk7.T1;
        if (i != i6 && i != i4) {
            if (i == i3) {
                String str2 = (String) objArr[0];
                if (this.E != null) {
                    str = this.x;
                } else {
                    str = this.w;
                }
                if (this.b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    vl5 vl5Var2 = this.b;
                    this.X = min;
                    vl5Var2.H(min);
                    return;
                }
                return;
            }
            int i7 = kk7.R1;
            int i8 = kk7.Q1;
            int i9 = kk7.Y1;
            int i10 = kk7.X1;
            if (i != i10 && i != i9 && i != i8 && i != i7) {
                int i11 = kk7.b2;
                int i12 = kk7.a2;
                int i13 = kk7.Z1;
                if (i == i11) {
                    if (((k27) objArr[0]) == this.E && this.a != null) {
                        kk7.f(i5).n(this, i13);
                        kk7.f(i5).n(this, i11);
                        kk7.f(i5).n(this, i12);
                        b();
                        return;
                    }
                    return;
                } else if (i == i12) {
                    if (((k27) objArr[0]) == this.E && this.a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            double d = this.Q;
                            if (d > longValue3) {
                                this.Q = longValue3;
                            } else {
                                longValue3 = d;
                            }
                            Bitmap r = z3a.r(str3, (long) (longValue3 * 1000.0d), null, true);
                            if (r != null) {
                                ba4.G(i5);
                                File J = ba4.J(this.n, null, true, true);
                                if (J != null) {
                                    if (w01.a) {
                                        fa4.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                ba4.G(i5);
                                File J2 = ba4.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (w01.a) {
                                        fa4.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = fl5.T(r, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize T = fl5.T(r, 150.0f, 150.0f, 80, 150, 150);
                                this.n = T;
                                if (T != null) {
                                    try {
                                        ba4.G(i5);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(ba4.J(this.n, null, true, true).getAbsolutePath());
                                        fl5.z().K(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            kk7.f(i5).n(this, i13);
                            kk7.f(i5).n(this, i11);
                            kk7.f(i5).n(this, i12);
                            this.y = str3;
                            this.x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == i13 && ((k27) objArr[0]) == this.E && (dVar = this.a) != null) {
                    this.x = (String) objArr[1];
                    dVar.getFileLoader().g0(this.x, false, false, (int) this.E.r0.q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.w)) {
                kk7.f(i5).n(this, i10);
                kk7.f(i5).n(this, i9);
                kk7.f(i5).n(this, i8);
                kk7.f(i5).n(this, i7);
                this.w = null;
                if (i != i10 && i != i8) {
                    this.e.g0(null);
                    vl5 vl5Var3 = this.b;
                    if (vl5Var3 != null) {
                        vl5Var3.T();
                        return;
                    }
                    return;
                }
                r(false, fl5.G(this.F, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.w)) {
            this.w = null;
            if (i == i6) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.x)) {
            this.x = null;
            if (i == i6) {
                this.O = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.w == null && this.x == null && this.E == null) {
            kk7.f(i5).n(this, i6);
            kk7.f(i5).n(this, i3);
            kk7.f(i5).n(this, i4);
            if (i == i6 && (vl5Var = this.b) != null) {
                vl5Var.U(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
            }
            b();
        }
    }

    public final void e(ArrayList arrayList, boolean z) {
        k27 k27Var;
        boolean z2;
        Bitmap G;
        if (!arrayList.isEmpty()) {
            y3a y3aVar = (y3a) arrayList.get(0);
            Bitmap bitmap = null;
            if ((y3aVar.o || y3aVar.k != null) && !y3aVar.p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                k27Var = new k27(y6c.t0, tL_message, false, false);
                k27Var.k.attachPath = new File(ba4.z(4), gba.p() + "_avatar.mp4").getAbsolutePath();
                k27Var.r0 = y3aVar.k;
                k27Var.s = y3aVar.v;
                bitmap = fl5.G(y3aVar.e, null, 800.0f, 800.0f, true);
            } else {
                String str = y3aVar.c;
                if (str != null) {
                    G = fl5.G(str, null, 800.0f, 800.0f, true);
                } else {
                    nm6 nm6Var = y3aVar.l;
                    if (nm6Var != null) {
                        TLRPC.Photo photo = nm6Var.K;
                        ImageReceiver imageReceiver = this.e;
                        int i = this.d;
                        if (photo != null) {
                            TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
                            if (w != null) {
                                ba4.G(i);
                                File J = ba4.J(w, null, true, true);
                                this.F = J.getAbsolutePath();
                                if (!J.exists()) {
                                    ba4.G(i);
                                    J = ba4.J(w, null, false, true);
                                    if (!J.exists()) {
                                        J = null;
                                    }
                                }
                                if (J != null) {
                                    G = fl5.G(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    kk7.f(i).a(this, kk7.X1);
                                    kk7.f(i).a(this, kk7.Y1);
                                    this.w = ba4.r(null, w.location);
                                    imageReceiver.d0(gl5.i(w, y3aVar.l.K), null, null, "jpg", null, 1);
                                }
                            }
                            G = null;
                        } else if (nm6Var.C != null) {
                            File file = new File(ba4.z(4), Utilities.a(y3aVar.l.C) + "." + fl5.x(y3aVar.l.C, "jpg"));
                            this.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                G = fl5.G(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                this.w = y3aVar.l.C;
                                kk7.f(i).a(this, kk7.Q1);
                                kk7.f(i).a(this, kk7.R1);
                                imageReceiver.e0(y3aVar.l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    z2 = z;
                    k27Var = null;
                    r(z2, bitmap, k27Var);
                }
                k27Var = null;
                bitmap = G;
            }
            z2 = z;
            r(z2, bitmap, k27Var);
        }
    }

    public final boolean f(Dialog dialog) {
        x02 x02Var = this.c;
        if (x02Var == null || dialog != x02Var) {
            return false;
        }
        x02Var.d2.b0(false);
        this.c.I();
        this.c.d2.f0(true);
        return true;
    }

    public final boolean g() {
        if (this.w == null && this.x == null && this.E == null) {
            return false;
        }
        return true;
    }

    public final void h(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 0 && i != 2) {
                if (i == 13) {
                    this.a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.r0().T1(null, this.a, null);
                    o(this.f, null, gl.N0(this.f), false);
                    gl.e(this.f);
                    this.f = null;
                    return;
                } else if (i == 14) {
                    if (intent != null && intent.getData() != null) {
                        gl.c3(new hb5(this, intent.getData(), (byte) 12));
                        return;
                    }
                    return;
                } else if (i == 15) {
                    p(this.f, null, true);
                    gl.e(this.f);
                    this.f = null;
                    return;
                } else {
                    return;
                }
            }
            d();
            x02 x02Var = this.c;
            if (x02Var != null) {
                x02Var.d2.j0(i, intent, this.f);
            }
            this.f = null;
        }
    }

    public final void i() {
        x02 x02Var = this.c;
        if (x02Var != null) {
            x02Var.g1();
        }
    }

    public final void j(int i, String[] strArr, int[] iArr) {
        x02 x02Var = this.c;
        if (x02Var != null) {
            if (i == 17) {
                x02Var.d2.V(false);
                this.c.d2.Z();
            } else if (i == 4) {
                x02Var.d2.Z();
            }
        }
    }

    public final void k() {
        x02 x02Var = this.c;
        if (x02Var != null) {
            x02Var.h1();
        }
    }

    public final void l() {
        d dVar = this.a;
        if (dVar != null && dVar.getParentActivity() != null) {
            try {
                if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q0 = gl.q0(null, false);
                if (q0 != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Activity parentActivity = this.a.getParentActivity();
                        a.d();
                        intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", q0));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q0));
                    }
                    this.f = q0.getAbsolutePath();
                }
                this.a.startActivityForResult(intent, 13);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void m() {
        int i;
        d dVar = this.a;
        if (dVar == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        if (Build.VERSION.SDK_INT >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.R) {
            i = 3;
        } else {
            i = 1;
        }
        g48 g48Var = new g48(i, false, false, null);
        g48Var.y = this.K;
        g48Var.W = new pj4(this, (byte) 7);
        this.a.presentFragment(g48Var);
    }

    public final void n(boolean z, Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i) {
        zw0 zw0Var;
        d dVar = this.a;
        if (dVar != null && dVar.getParentActivity() != null) {
            this.U = false;
            this.V = i;
            boolean z2 = this.H;
            d dVar2 = this.a;
            if (z2) {
                if (dVar2 != null && dVar2.getParentActivity() != null) {
                    d();
                    x02 x02Var = this.c;
                    x02Var.R3 = this.I;
                    x02Var.t1(1, false);
                    this.c.d2.h0();
                    this.c.Z0();
                    x02 x02Var2 = this.c;
                    x02Var2.I0 = onDismissListener;
                    byte b = this.V;
                    if (b != 0) {
                        x02Var2.K1 = new ul5(b, this.M);
                    }
                    this.a.showDialog(x02Var2);
                    return;
                }
                return;
            }
            fx0 i2 = ug8.i(dVar2.getParentActivity(), false, 1, null);
            if (i == 1) {
                i2.P = k96.a0("SetPhotoFor", null, 2131745326, this.M.first_name);
                i2.Q = true;
            } else if (i == 2) {
                i2.P = k96.a0("SuggestPhotoFor", null, 2131744165, this.M.first_name);
                i2.Q = true;
            } else {
                i2.P = k96.M0(2131752111, null);
                i2.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            b00.r(null, 2131752101, arrayList, 2131232091, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                b00.r(null, 2131752108, arrayList, 2131232423, arrayList2);
                arrayList3.add(4);
            }
            b00.r(null, 2131752116, arrayList, 2131232297, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                b00.r(null, 2131752114, arrayList, 2131232359, arrayList2);
                arrayList3.add(2);
            }
            if (z) {
                b00.r(null, 2131751502, arrayList, 2131232113, arrayList2);
                arrayList3.add(3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
            }
            rl5 rl5Var = new rl5(this, arrayList3, runnable, (byte) 0);
            i2.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            i2.N = iArr;
            i2.L = rl5Var;
            i2.I0 = onDismissListener;
            this.a.showDialog(i2);
            if (z) {
                int i4 = bkb.p7;
                int w0 = bkb.w0(null, i4, false);
                int i5 = bkb.o7;
                i2.w0(arrayList.size() - 1, w0, bkb.w0(null, i5, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < i2.x0.size() && (zw0Var = (zw0) i2.x0.get(size2)) != null && zw0Var.getTextView() != null && zw0Var.getImageView() != null) {
                    zkb.X(zw0Var.getTextView(), i4, null);
                    zkb.s(zw0Var.getImageView(), i5, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z) {
        ArrayList arrayList = new ArrayList();
        jm6 jm6Var = new jm6(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        jm6Var.n(pair);
        jm6Var.b = z;
        jm6Var.c = str2;
        arrayList.add(jm6Var);
        PhotoViewer.r0().T1(null, this.a, null);
        PhotoViewer.r0().o1(arrayList, 0, 1, false, new tl5(this, arrayList), null);
        PhotoViewer.r0().Q = true;
    }

    public final void p(String str, String str2, boolean z) {
        o(str, str2, new Pair(0, 0), z);
    }

    public final void q() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        u58 u58Var = new u58(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.b = hashMap;
        obj.c = arrayList;
        u58Var.t0 = obj;
        u58Var.j0(1, false);
        u58Var.q0 = this.b.getInitialSearchString();
        boolean z = this.T;
        d dVar = this.a;
        if (z) {
            dVar.showAsSheet(u58Var);
        } else {
            dVar.presentFragment(u58Var);
        }
    }

    public final void r(boolean z, Bitmap bitmap, k27 k27Var) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.y = null;
            if (k27Var == null) {
                videoSize = null;
            } else {
                videoSize = k27Var.s;
            }
            this.P = videoSize;
            this.h = fl5.T(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize T = fl5.T(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.n = T;
            if (T != null) {
                try {
                    ba4.G(this.d);
                    Bitmap decodeFile = BitmapFactory.decodeFile(ba4.J(this.n, null, true, true).getAbsolutePath());
                    this.r = decodeFile;
                    fl5.z().K(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                y6c.h(this.d).u(false);
                StringBuilder sb = new StringBuilder();
                sb.append(ba4.z(4));
                sb.append("/");
                sb.append(this.h.location.volume_id);
                sb.append("_");
                this.w = de9.l(sb, this.h.location.local_id, ".jpg");
                if (this.L) {
                    if (k27Var != null && k27Var.r0 != null) {
                        if (this.J && !na7.q1(this.d).k4.D0.f) {
                            vl5 vl5Var = this.b;
                            if (vl5Var != null) {
                                vl5Var.O(z, true);
                            }
                            vl5 vl5Var2 = this.b;
                            if (vl5Var2 != null) {
                                vl5Var2.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                                this.b.U(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                                b();
                                return;
                            }
                            return;
                        }
                        this.E = k27Var;
                        oac oacVar = k27Var.r0;
                        long j = oacVar.a;
                        if (j < 0) {
                            j = 0;
                        }
                        this.Q = (oacVar.c - j) / 1000000.0d;
                        oacVar.Y = false;
                        kk7.f(this.d).a(this, kk7.Z1);
                        kk7.f(this.d).a(this, kk7.b2);
                        kk7.f(this.d).a(this, kk7.a2);
                        MediaController.w().g0(k27Var, true, true, false);
                        this.w = null;
                        vl5 vl5Var3 = this.b;
                        if (vl5Var3 != null) {
                            vl5Var3.O(z, true);
                        }
                        this.s = true;
                    } else {
                        vl5 vl5Var4 = this.b;
                        if (vl5Var4 != null) {
                            vl5Var4.O(z, false);
                        }
                        this.s = false;
                    }
                    kk7.f(this.d).a(this, kk7.T1);
                    kk7.f(this.d).a(this, kk7.V1);
                    kk7.f(this.d).a(this, kk7.U1);
                    if (this.w != null) {
                        ba4.G(this.d).h0(false, 16777216, this.w, true);
                    }
                }
                vl5 vl5Var5 = this.b;
                if (vl5Var5 != null) {
                    vl5Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                }
            }
        }
    }

    public final void s(jm6 jm6Var) {
        Bitmap G;
        String str = jm6Var.h;
        if (str == null) {
            str = jm6Var.I;
        }
        k27 k27Var = null;
        if ((jm6Var.b || jm6Var.s != null) && !jm6Var.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            k27 k27Var2 = new k27(y6c.t0, tL_message, false, false);
            TLRPC.Message message = k27Var2.k;
            File z = ba4.z(4);
            message.attachPath = new File(z, gba.p() + "_avatar.mp4").getAbsolutePath();
            k27Var2.r0 = jm6Var.s;
            k27Var2.s = jm6Var.S;
            G = fl5.G(jm6Var.c, null, 800.0f, 800.0f, true);
            k27Var = k27Var2;
        } else {
            G = fl5.G(str, null, 800.0f, 800.0f, true);
        }
        r(false, G, k27Var);
    }
}
