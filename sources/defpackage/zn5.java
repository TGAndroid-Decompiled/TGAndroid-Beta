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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class zn5 implements fn7 {
    public r47 E;
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
    public e a;
    public yn5 b;
    public n12 c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = yac.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public zn5(int i, boolean z, boolean z2) {
        this.R = z;
        this.J = z2;
        this.W = i;
    }

    public final void a() {
        this.U = true;
        String str = this.w;
        int i = this.d;
        if (str != null) {
            xb4.G(i).b(this.w, false);
        }
        if (this.x != null) {
            xb4.G(i).b(this.x, false);
        }
        yn5 yn5Var = this.b;
        if (yn5Var != null) {
            yn5Var.T();
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
        n12 n12Var = this.c;
        if (n12Var != null) {
            n12Var.H();
            this.c.f1();
        }
    }

    public final void d() {
        byte b;
        yf0 yf0Var;
        boolean z;
        e eVar = this.a;
        if (eVar != null && eVar.getParentActivity() != null) {
            n12 n12Var = this.c;
            if (n12Var == null) {
                n12 n12Var2 = new n12(this.a.getParentActivity(), this.a, this.S, this.T);
                this.c = n12Var2;
                if (this.R) {
                    b = 2;
                } else {
                    b = 1;
                }
                yn5 yn5Var = this.b;
                if (yn5Var != null && yn5Var.x()) {
                    yn5 yn5Var2 = this.b;
                    Objects.requireNonNull(yn5Var2);
                    yf0Var = new yf0(yn5Var2, (byte) 2);
                } else {
                    yf0Var = null;
                }
                n12Var2.N2 = b;
                n12Var2.O2 = yf0Var;
                n12Var2.P2 = false;
                f12 f12Var = n12Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var2.d2;
                if (f12Var == null || f12Var == chatAttachAlertPhotoLayout) {
                    n12Var2.u3.setVisibility(8);
                }
                byte b2 = n12Var2.N2;
                TextView textView = n12Var2.g3;
                if (b2 == 2) {
                    textView.setText(ob6.M0(2131752086, null));
                } else {
                    textView.setText(ob6.M0(2131752088, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    n12 n12Var3 = chatAttachAlertPhotoLayout.b;
                    if (n12Var3.N2 != 0 && !n12Var3.z1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    chatAttachAlertPhotoLayout.h1 = z;
                }
                n12Var = this.c;
                n12Var.W3 = new vn5(this);
                n12Var.O1 = this;
            }
            TextView textView2 = n12Var.g3;
            byte b3 = this.V;
            if (b3 == 1) {
                textView2.setText(ob6.a0("SetPhotoFor", null, 2131745246, this.M.first_name));
            } else if (b3 == 2) {
                textView2.setText(ob6.a0("SuggestPhotoFor", null, 2131744059, this.M.first_name));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        yn5 yn5Var;
        e eVar;
        String str;
        int i3 = jn7.W1;
        int i4 = jn7.V1;
        int i5 = this.d;
        int i6 = jn7.U1;
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
                    yn5 yn5Var2 = this.b;
                    this.X = min;
                    yn5Var2.H(min);
                    return;
                }
                return;
            }
            int i7 = jn7.S1;
            int i8 = jn7.R1;
            int i9 = jn7.Z1;
            int i10 = jn7.Y1;
            if (i != i10 && i != i9 && i != i8 && i != i7) {
                int i11 = jn7.c2;
                int i12 = jn7.b2;
                int i13 = jn7.a2;
                if (i == i11) {
                    if (((r47) objArr[0]) == this.E && this.a != null) {
                        jn7.f(i5).n(this, i13);
                        jn7.f(i5).n(this, i11);
                        jn7.f(i5).n(this, i12);
                        b();
                        return;
                    }
                    return;
                } else if (i == i12) {
                    if (((r47) objArr[0]) == this.E && this.a != null) {
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
                            Bitmap r = r7a.r(str3, (long) (longValue3 * 1000.0d), null, true);
                            if (r != null) {
                                xb4.G(i5);
                                File J = xb4.J(this.n, null, true, true);
                                if (J != null) {
                                    if (f11.a) {
                                        cc4.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                xb4.G(i5);
                                File J2 = xb4.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (f11.a) {
                                        cc4.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = in5.T(r, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize T = in5.T(r, 150.0f, 150.0f, 80, 150, 150);
                                this.n = T;
                                if (T != null) {
                                    try {
                                        xb4.G(i5);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(xb4.J(this.n, null, true, true).getAbsolutePath());
                                        in5.z().K(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            jn7.f(i5).n(this, i13);
                            jn7.f(i5).n(this, i11);
                            jn7.f(i5).n(this, i12);
                            this.y = str3;
                            this.x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == i13 && ((r47) objArr[0]) == this.E && (eVar = this.a) != null) {
                    this.x = (String) objArr[1];
                    eVar.getFileLoader().g0(this.x, false, false, (int) this.E.r0.q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.w)) {
                jn7.f(i5).n(this, i10);
                jn7.f(i5).n(this, i9);
                jn7.f(i5).n(this, i8);
                jn7.f(i5).n(this, i7);
                this.w = null;
                if (i != i10 && i != i8) {
                    this.e.g0(null);
                    yn5 yn5Var3 = this.b;
                    if (yn5Var3 != null) {
                        yn5Var3.T();
                        return;
                    }
                    return;
                }
                r(false, in5.G(this.F, null, 800.0f, 800.0f, true), null);
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
            jn7.f(i5).n(this, i6);
            jn7.f(i5).n(this, i3);
            jn7.f(i5).n(this, i4);
            if (i == i6 && (yn5Var = this.b) != null) {
                yn5Var.U(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
            }
            b();
        }
    }

    public final void e(ArrayList arrayList, boolean z) {
        r47 r47Var;
        boolean z2;
        Bitmap G;
        if (!arrayList.isEmpty()) {
            q7a q7aVar = (q7a) arrayList.get(0);
            Bitmap bitmap = null;
            if ((q7aVar.o || q7aVar.k != null) && !q7aVar.p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                r47Var = new r47(yac.t0, tL_message, false, false);
                r47Var.k.attachPath = new File(xb4.z(4), xea.p() + "_avatar.mp4").getAbsolutePath();
                r47Var.r0 = q7aVar.k;
                r47Var.s = q7aVar.v;
                bitmap = in5.G(q7aVar.e, null, 800.0f, 800.0f, true);
            } else {
                String str = q7aVar.c;
                if (str != null) {
                    G = in5.G(str, null, 800.0f, 800.0f, true);
                } else {
                    ro6 ro6Var = q7aVar.l;
                    if (ro6Var != null) {
                        TLRPC.Photo photo = ro6Var.K;
                        ImageReceiver imageReceiver = this.e;
                        int i = this.d;
                        if (photo != null) {
                            TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
                            if (w != null) {
                                xb4.G(i);
                                File J = xb4.J(w, null, true, true);
                                this.F = J.getAbsolutePath();
                                if (!J.exists()) {
                                    xb4.G(i);
                                    J = xb4.J(w, null, false, true);
                                    if (!J.exists()) {
                                        J = null;
                                    }
                                }
                                if (J != null) {
                                    G = in5.G(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    jn7.f(i).a(this, jn7.Y1);
                                    jn7.f(i).a(this, jn7.Z1);
                                    this.w = xb4.r(null, w.location);
                                    imageReceiver.d0(jn5.i(w, q7aVar.l.K), null, null, "jpg", null, 1);
                                }
                            }
                            G = null;
                        } else if (ro6Var.C != null) {
                            File file = new File(xb4.z(4), Utilities.a(q7aVar.l.C) + "." + in5.x(q7aVar.l.C, "jpg"));
                            this.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                G = in5.G(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                this.w = q7aVar.l.C;
                                jn7.f(i).a(this, jn7.R1);
                                jn7.f(i).a(this, jn7.S1);
                                imageReceiver.e0(q7aVar.l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    z2 = z;
                    r47Var = null;
                    r(z2, bitmap, r47Var);
                }
                r47Var = null;
                bitmap = G;
            }
            z2 = z;
            r(z2, bitmap, r47Var);
        }
    }

    public final boolean f(Dialog dialog) {
        n12 n12Var = this.c;
        if (n12Var == null || dialog != n12Var) {
            return false;
        }
        n12Var.d2.a0(false);
        this.c.H();
        this.c.d2.e0(true);
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
                    PhotoViewer.q0().T1(null, this.a, null);
                    o(this.f, null, hl.N0(this.f), false);
                    hl.e(this.f);
                    this.f = null;
                    return;
                } else if (i == 14) {
                    if (intent != null && intent.getData() != null) {
                        hl.c3(new tg5(this, intent.getData(), (byte) 9));
                        return;
                    }
                    return;
                } else if (i == 15) {
                    p(this.f, null, true);
                    hl.e(this.f);
                    this.f = null;
                    return;
                } else {
                    return;
                }
            }
            d();
            n12 n12Var = this.c;
            if (n12Var != null) {
                n12Var.d2.i0(i, intent, this.f);
            }
            this.f = null;
        }
    }

    public final void i() {
        n12 n12Var = this.c;
        if (n12Var != null) {
            n12Var.h1();
        }
    }

    public final void j(int i, String[] strArr, int[] iArr) {
        n12 n12Var = this.c;
        if (n12Var != null) {
            if (i == 17) {
                n12Var.d2.U(false);
                this.c.d2.Y();
            } else if (i == 4) {
                n12Var.d2.Y();
            }
        }
    }

    public final void k() {
        n12 n12Var = this.c;
        if (n12Var != null) {
            n12Var.i1();
        }
    }

    public final void l() {
        e eVar = this.a;
        if (eVar != null && eVar.getParentActivity() != null) {
            try {
                if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q0 = hl.q0(null, false);
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
                cc4.g(e, true);
            }
        }
    }

    public final void m() {
        int i;
        e eVar = this.a;
        if (eVar == null) {
            return;
        }
        Activity parentActivity = eVar.getParentActivity();
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
        w78 w78Var = new w78(i, false, false, null);
        w78Var.y = this.K;
        w78Var.W = new v34(this, (byte) 9);
        this.a.presentFragment(w78Var);
    }

    public final void n(boolean z, Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i) {
        hx0 hx0Var;
        e eVar = this.a;
        if (eVar != null && eVar.getParentActivity() != null) {
            this.U = false;
            this.V = i;
            boolean z2 = this.H;
            e eVar2 = this.a;
            if (z2) {
                if (eVar2 != null && eVar2.getParentActivity() != null) {
                    d();
                    n12 n12Var = this.c;
                    n12Var.R3 = this.I;
                    n12Var.u1(1, false);
                    this.c.d2.g0();
                    this.c.a1();
                    n12 n12Var2 = this.c;
                    n12Var2.I0 = onDismissListener;
                    byte b = this.V;
                    if (b != 0) {
                        n12Var2.K1 = new xn5(b, this.M);
                    }
                    this.a.showDialog(n12Var2);
                    return;
                }
                return;
            }
            nx0 i2 = ik8.i(eVar2.getParentActivity(), false, 1, null);
            if (i == 1) {
                i2.P = ob6.a0("SetPhotoFor", null, 2131745246, this.M.first_name);
                i2.Q = true;
            } else if (i == 2) {
                i2.P = ob6.a0("SuggestPhotoFor", null, 2131744059, this.M.first_name);
                i2.Q = true;
            } else {
                i2.P = ob6.M0(2131752088, null);
                i2.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c00.s(null, 2131752078, arrayList, 2131232091, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                c00.s(null, 2131752085, arrayList, 2131232423, arrayList2);
                arrayList3.add(4);
            }
            c00.s(null, 2131752093, arrayList, 2131232297, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                c00.s(null, 2131752091, arrayList, 2131232359, arrayList2);
                arrayList3.add(2);
            }
            if (z) {
                c00.s(null, 2131751479, arrayList, 2131232113, arrayList2);
                arrayList3.add(3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
            }
            un5 un5Var = new un5(this, arrayList3, runnable, (byte) 0);
            i2.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            i2.N = iArr;
            i2.L = un5Var;
            i2.I0 = onDismissListener;
            this.a.showDialog(i2);
            if (z) {
                int i4 = aob.q7;
                int w0 = aob.w0(null, i4, false);
                int i5 = aob.p7;
                i2.x0(arrayList.size() - 1, w0, aob.w0(null, i5, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < i2.x0.size() && (hx0Var = (hx0) i2.x0.get(size2)) != null && hx0Var.getTextView() != null && hx0Var.getImageView() != null) {
                    yob.X(hx0Var.getTextView(), i4, null);
                    yob.s(hx0Var.getImageView(), i5, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z) {
        ArrayList arrayList = new ArrayList();
        no6 no6Var = new no6(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        no6Var.n(pair);
        no6Var.b = z;
        no6Var.c = str2;
        arrayList.add(no6Var);
        PhotoViewer.q0().T1(null, this.a, null);
        PhotoViewer.q0().o1(arrayList, 0, 1, false, new wn5(this, arrayList), null);
        PhotoViewer.q0().Q = true;
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
        l98 l98Var = new l98(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.b = hashMap;
        obj.c = arrayList;
        l98Var.t0 = obj;
        l98Var.j0(1, false);
        l98Var.q0 = this.b.getInitialSearchString();
        boolean z = this.T;
        e eVar = this.a;
        if (z) {
            eVar.showAsSheet(l98Var);
        } else {
            eVar.presentFragment(l98Var);
        }
    }

    public final void r(boolean z, Bitmap bitmap, r47 r47Var) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.y = null;
            if (r47Var == null) {
                videoSize = null;
            } else {
                videoSize = r47Var.s;
            }
            this.P = videoSize;
            this.h = in5.T(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize T = in5.T(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.n = T;
            if (T != null) {
                try {
                    xb4.G(this.d);
                    Bitmap decodeFile = BitmapFactory.decodeFile(xb4.J(this.n, null, true, true).getAbsolutePath());
                    this.r = decodeFile;
                    in5.z().K(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                yac.h(this.d).u(false);
                StringBuilder sb = new StringBuilder();
                sb.append(xb4.z(4));
                sb.append("/");
                sb.append(this.h.location.volume_id);
                sb.append("_");
                this.w = uh9.l(sb, this.h.location.local_id, ".jpg");
                if (this.L) {
                    if (r47Var != null && r47Var.r0 != null) {
                        if (this.J && !uc7.s1(this.d).l4.L0.f) {
                            yn5 yn5Var = this.b;
                            if (yn5Var != null) {
                                yn5Var.O(z, true);
                            }
                            yn5 yn5Var2 = this.b;
                            if (yn5Var2 != null) {
                                yn5Var2.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                                this.b.U(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                                b();
                                return;
                            }
                            return;
                        }
                        this.E = r47Var;
                        oec oecVar = r47Var.r0;
                        long j = oecVar.a;
                        if (j < 0) {
                            j = 0;
                        }
                        this.Q = (oecVar.c - j) / 1000000.0d;
                        oecVar.Y = false;
                        jn7.f(this.d).a(this, jn7.a2);
                        jn7.f(this.d).a(this, jn7.c2);
                        jn7.f(this.d).a(this, jn7.b2);
                        MediaController.z().j0(r47Var, true, true, false);
                        this.w = null;
                        yn5 yn5Var3 = this.b;
                        if (yn5Var3 != null) {
                            yn5Var3.O(z, true);
                        }
                        this.s = true;
                    } else {
                        yn5 yn5Var4 = this.b;
                        if (yn5Var4 != null) {
                            yn5Var4.O(z, false);
                        }
                        this.s = false;
                    }
                    jn7.f(this.d).a(this, jn7.U1);
                    jn7.f(this.d).a(this, jn7.W1);
                    jn7.f(this.d).a(this, jn7.V1);
                    if (this.w != null) {
                        xb4.G(this.d).h0(false, 16777216, this.w, true);
                    }
                }
                yn5 yn5Var5 = this.b;
                if (yn5Var5 != null) {
                    yn5Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                }
            }
        }
    }

    public final void s(no6 no6Var) {
        Bitmap G;
        String str = no6Var.h;
        if (str == null) {
            str = no6Var.I;
        }
        r47 r47Var = null;
        if ((no6Var.b || no6Var.s != null) && !no6Var.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            r47 r47Var2 = new r47(yac.t0, tL_message, false, false);
            TLRPC.Message message = r47Var2.k;
            File z = xb4.z(4);
            message.attachPath = new File(z, xea.p() + "_avatar.mp4").getAbsolutePath();
            r47Var2.r0 = no6Var.s;
            r47Var2.s = no6Var.S;
            G = in5.G(no6Var.c, null, 800.0f, 800.0f, true);
            r47Var = r47Var2;
        } else {
            G = in5.G(str, null, 800.0f, 800.0f, true);
        }
        r(false, G, r47Var);
    }
}
