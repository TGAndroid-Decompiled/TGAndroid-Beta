package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
public final class bm6 implements s84, xj4, a8b, xx6, ot2, pz6, mz6, NativeLifecycleLock.NativeDisposer, t69, hj, ui7, rk6, ncc, on5, nr7, rv9, fd, z8c, ic1, nu4 {
    public final byte a;
    public final Object b;

    public bm6(h9a h9aVar) {
        this.a = (byte) 3;
        Bundle bundle = Bundle.EMPTY;
        this.b = h9aVar;
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        lm7 lm7Var = (lm7) this.b;
        mq5 H0 = hl.H0(l2dVar, false);
        lm7Var.G = H0.d;
        lm7Var.P = l2dVar.a.f(8).d;
        view.setPadding(H0.a, view.getPaddingTop(), H0.c, 0);
        lm7Var.K0(false);
        view.post(new wl7(lm7Var, (byte) 1));
        return l2d.b;
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override
    public final void accept(Object obj) {
        ((og8) obj).c((of8) this.b);
    }

    @Override
    public final void b(ww6 ww6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                Bundle bundle = Bundle.EMPTY;
                ww6Var.a(i, (h9a) obj);
                return;
            default:
                ww6Var.f(i, (zf8) obj);
                return;
        }
    }

    @Override
    public final Object c(Object obj, Object obj2) {
        return ose.b((List) ((Collection) obj2), new nk6(((hj7) this.b).f, obj));
    }

    @Override
    public final void d(og8 og8Var, xw6 xw6Var) {
        ((ot2) this.b).accept(og8Var);
    }

    @Override
    public final void dispose(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                ((MediaSource) obj).lambda$dispose$2(j);
                return;
            default:
                MediaStream.j((MediaStream) obj, j);
                return;
        }
    }

    @Override
    public final boolean e(int i, View view) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                final z67 z67Var = (z67) obj;
                if (i >= z67Var.J && i < z67Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final r47 r47Var = (r47) z67Var.y.get(i - z67Var.J);
                    final long B0 = r47.B0(r47Var.k);
                    final boolean D = wf3.D(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z67Var.getResourceProvider(), z67Var.getParentActivity());
                    if (r47Var.w4()) {
                        if (D) {
                            i2 = 2131747513;
                        } else {
                            i2 = 2131747538;
                        }
                        arrayList.add(ob6.M0(i2, null));
                        if (D) {
                            i3 = 2131232271;
                        } else {
                            i3 = 2131232093;
                        }
                        arrayList3.add(Integer.valueOf(i3));
                    } else {
                        c00.s(null, 2131743202, arrayList, 2131232260, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = hl.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        iArr[i4] = ((Integer) arrayList3.get(i4)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            e ha;
                            r47 r47Var2 = r47Var;
                            boolean w4 = r47Var2.w4();
                            e eVar = z67.this;
                            boolean z = D;
                            long j = B0;
                            if (w4) {
                                if (z) {
                                    ha = ProfileActivity.Q2(j);
                                } else {
                                    ha = zu1.ha(j);
                                }
                                eVar.presentFragment(ha);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z) {
                                bundle.putLong("user_id", j);
                            } else {
                                bundle.putLong("chat_id", -j);
                            }
                            bundle.putInt("message_id", r47Var2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (eVar.getMessagesController().C(bundle, eVar, null, null)) {
                                eVar.presentFragment(new zu1(bundle));
                            }
                        }
                    };
                    id idVar = alertDialog$Builder.a;
                    idVar.Q = charSequenceArr;
                    idVar.R = iArr;
                    idVar.N = onClickListener;
                    z67Var.showDialog(idVar);
                }
                return false;
            default:
                aq7 aq7Var = (aq7) obj;
                if (view instanceof zp7) {
                    zp7 zp7Var = (zp7) view;
                    aq7Var.b0(zp7Var.e);
                    zp7Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public final void f() {
        float f;
        wab wabVar = (wab) this.b;
        TextView textView = wabVar.Y0;
        boolean a = wabVar.n0.a();
        ImageView imageView = wabVar.X0;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f2 = 0.6f;
        if (a) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        animate.alpha(f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a) {
            f2 = 1.0f;
        }
        animate2.alpha(f2).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override
    public final void g(float f) {
        bn6 bn6Var = (bn6) this.b;
        zec zecVar = bn6Var.f1.b;
        if (zecVar.f != f) {
            zecVar.f = f;
            zecVar.c(false);
        }
        bn6Var.G0(bn6Var.d0);
    }

    @Override
    public final long get() {
        return ((kj4) this.b).z();
    }

    @Override
    public final Object h(Object obj) {
        ih7 ih7Var = (ih7) obj;
        return Float.valueOf(((xk4) this.b).a / 100.0f);
    }

    @Override
    public final Bitmap i(BitmapFactory.Options options) {
        no6 no6Var = (no6) this.b;
        String str = no6Var.i;
        if (str == null) {
            str = no6Var.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                mz6 mz6Var = (mz6) obj;
                if (yx6Var.i()) {
                    return do5.b;
                }
                yx6Var.t();
                mz6Var.d(yx6Var.t, xw6Var);
                sz6.W(yx6Var, xw6Var, i, new gaa(0));
                return do5.b;
            default:
                return yx6Var.o(xw6Var, po5.u((ft6) obj), -1, -9223372036854775807L);
        }
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i;
        ut7 ut7Var;
        ut7 ut7Var2;
        int i2;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 15:
                oab oabVar = (oab) obj3;
                b8c b8cVar = (b8c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                int i3 = b8cVar.d;
                c8b c8bVar = (c8b) b8cVar.H;
                oabVar.c(false, true);
                sbb sbbVar = oabVar.P;
                if (c8bVar != sbbVar.L1 && !sbbVar.Y1) {
                    sbbVar.e1.setSelected(i3);
                    sbbVar.Y1 = true;
                    oe7 oe7Var = new oe7(sbbVar, i3, (byte) 21);
                    wab wabVar = sbbVar.w1;
                    c8b c8bVar2 = sbbVar.L1;
                    if (wabVar != null && c8bVar2 != null) {
                        if (!wabVar.r0()) {
                            oe7Var.run();
                            return;
                        }
                        c8bVar2.f();
                        Utilities.g.c(new b6a(sbbVar, wabVar, c8bVar2.i0, c8bVar2.j0, c8bVar2, wabVar.y0.getPainting().E, wabVar.r0(), oe7Var, (byte) 2));
                        return;
                    }
                    oe7Var.run();
                    return;
                }
                return;
            case 23:
                vt7 vt7Var = (vt7) obj3;
                b8c b8cVar2 = (b8c) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f3 = (Float) serializable2;
                int i4 = b8cVar2.d;
                if (i4 == -1) {
                    boolean z = !vt7Var.d;
                    vt7Var.d = z;
                    ((wkb) view2).setChecked(z);
                    vt7Var.a.g3.O(true);
                    vt7Var.Z(true);
                    return;
                } else if (i4 == -2) {
                    ?? eVar = new e(null);
                    eVar.n = vt7Var.n;
                    eVar.c = new v35(vt7Var, view2, (byte) 14);
                    vt7Var.presentFragment((e) eVar);
                    return;
                } else if (b8cVar2.a == 5 && i4 >= 0 && i4 < vt7Var.f.length) {
                    if (!ob6.a0 ? floatValue >= view2.getMeasuredWidth() - hl.L(76.0f) : floatValue <= hl.L(76.0f)) {
                        if (vt7Var.f[b8cVar2.d].isEmpty()) {
                            ((uo7) view2).setChecked(true);
                            vt7Var.f[b8cVar2.d].add(new ut7(0, 1439));
                            vt7Var.Y(b8cVar2.d);
                        } else {
                            vt7Var.f[b8cVar2.d].clear();
                            ((uo7) view2).setChecked(false);
                        }
                        ((uo7) view2).setValue(vt7.c0(vt7Var.f[b8cVar2.d]));
                        vt7Var.Z(true);
                        return;
                    }
                    int i5 = (b8cVar2.d + 6) % 7;
                    int i6 = 0;
                    for (int i7 = 0; i7 < vt7Var.f[i5].size(); i7++) {
                        if (((ut7) vt7Var.f[i5].get(i7)).b > i6) {
                            i6 = ((ut7) vt7Var.f[i5].get(i7)).b;
                        }
                    }
                    int max = Math.max(0, i6 - 1439);
                    int i8 = (b8cVar2.d + 1) % 7;
                    int i9 = 1440;
                    for (int i10 = 0; i10 < vt7Var.f[i8].size(); i10++) {
                        if (((ut7) vt7Var.f[i8].get(i10)).a < i9) {
                            i9 = ((ut7) vt7Var.f[i8].get(i10)).a;
                        }
                    }
                    int i11 = i9 + 1439;
                    CharSequence charSequence = b8cVar2.m;
                    ArrayList arrayList = vt7Var.f[b8cVar2.d];
                    int i12 = 0;
                    for (int i13 = 0; i13 < 7; i13++) {
                        ArrayList arrayList2 = vt7Var.f[i13];
                        if (arrayList2 != null) {
                            i12 = Math.max(1, arrayList2.size()) + i12;
                        }
                    }
                    xt7 xt7Var = new xt7(charSequence, arrayList, max, i11, 28 - i12);
                    xt7Var.f = new ge7(vt7Var, (byte) 15);
                    xt7Var.h = new ql7(vt7Var, b8cVar2, (byte) 12);
                    vt7Var.presentFragment(xt7Var);
                    return;
                } else {
                    return;
                }
            default:
                final xt7 xt7Var2 = (xt7) obj3;
                b8c b8cVar3 = (b8c) obj;
                final View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f4 = (Float) serializable;
                Float f5 = (Float) serializable2;
                int i14 = xt7Var2.c;
                int i15 = xt7Var2.d;
                ArrayList arrayList3 = xt7Var2.b;
                int i16 = b8cVar3.d;
                if (i16 == -1) {
                    xt7Var2.r = !xt7Var2.r;
                    arrayList3.clear();
                    if (xt7Var2.r) {
                        arrayList3.add(new ut7(0, 1439));
                    }
                    wkb wkbVar = (wkb) view3;
                    boolean z2 = xt7Var2.r;
                    b8cVar3.e = z2;
                    wkbVar.setChecked(z2);
                    boolean z3 = xt7Var2.r;
                    if (z3) {
                        i2 = aob.f6;
                    } else {
                        i2 = aob.e6;
                    }
                    wkbVar.b(aob.w0(null, i2, false), z3);
                    xt7Var2.n.g3.O(true);
                    ge7 ge7Var = xt7Var2.f;
                    if (ge7Var != null) {
                        ge7Var.run();
                        return;
                    }
                    return;
                } else if (i16 == -2) {
                    if (!arrayList3.isEmpty() && !xt7Var2.Y()) {
                        int i17 = ((ut7) c00.g(1, arrayList3)).b;
                        int j = Utilities.j(i17 + 30, i15 - 1, i14);
                        arrayList3.add(new ut7(j, Utilities.j((i17 + 1560) / 2, i15, j + 1)));
                    } else {
                        if (xt7Var2.Y()) {
                            arrayList3.clear();
                        }
                        int j2 = Utilities.j(480, i15 - 1, i14);
                        arrayList3.add(new ut7(j2, Utilities.j(1200, i15, j2 + 1)));
                    }
                    ge7 ge7Var2 = xt7Var2.f;
                    if (ge7Var2 != null) {
                        ge7Var2.run();
                    }
                    xt7Var2.n.g3.O(true);
                    return;
                } else if (b8cVar3.a == 3 && (i = i16 / 3) >= 0 && i < arrayList3.size()) {
                    int i18 = i - 1;
                    if (i18 >= 0) {
                        ut7Var = (ut7) arrayList3.get(i18);
                    } else {
                        ut7Var = null;
                    }
                    final ut7 ut7Var3 = (ut7) arrayList3.get(i);
                    int i19 = i + 1;
                    if (i19 < arrayList3.size()) {
                        ut7Var2 = (ut7) arrayList3.get(i19);
                    } else {
                        ut7Var2 = null;
                    }
                    int i20 = b8cVar3.d % 3;
                    if (i20 == 0) {
                        Activity parentActivity = xt7Var2.getParentActivity();
                        String M0 = ob6.M0(2131752731, null);
                        int i21 = ut7Var3.a;
                        if (ut7Var != null) {
                            i14 = ut7Var.b + 1;
                        }
                        jj.U(parentActivity, M0, i21, i14, ut7Var3.b - 1, new pcc() {
                            @Override
                            public final void a(Object obj4) {
                                byte b2 = r4;
                                ut7 ut7Var4 = ut7Var3;
                                View view4 = view3;
                                xt7 xt7Var3 = xt7Var2;
                                Integer num4 = (Integer) obj4;
                                switch (b2) {
                                    case 0:
                                        boolean Z = xt7Var3.Z();
                                        int intValue = num4.intValue();
                                        ut7Var4.a = intValue;
                                        ((skb) view4).w(ut7.a(intValue), true);
                                        if (Z != xt7Var3.Z()) {
                                            xt7Var3.n.g3.O(true);
                                        }
                                        ge7 ge7Var3 = xt7Var3.f;
                                        if (ge7Var3 != null) {
                                            ge7Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        boolean Z2 = xt7Var3.Z();
                                        int intValue2 = num4.intValue();
                                        ut7Var4.b = intValue2;
                                        ((skb) view4).w(ut7.a(intValue2), true);
                                        if (Z2 != xt7Var3.Z()) {
                                            xt7Var3.n.g3.O(true);
                                        }
                                        ge7 ge7Var4 = xt7Var3.f;
                                        if (ge7Var4 != null) {
                                            ge7Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i20 == 1) {
                        Activity parentActivity2 = xt7Var2.getParentActivity();
                        String M02 = ob6.M0(2131752737, null);
                        int i22 = ut7Var3.b;
                        int i23 = ut7Var3.a + 1;
                        if (ut7Var2 != null) {
                            i15 = ut7Var2.a - 1;
                        }
                        jj.U(parentActivity2, M02, i22, i23, i15, new pcc() {
                            @Override
                            public final void a(Object obj4) {
                                byte b2 = r4;
                                ut7 ut7Var4 = ut7Var3;
                                View view4 = view3;
                                xt7 xt7Var3 = xt7Var2;
                                Integer num4 = (Integer) obj4;
                                switch (b2) {
                                    case 0:
                                        boolean Z = xt7Var3.Z();
                                        int intValue = num4.intValue();
                                        ut7Var4.a = intValue;
                                        ((skb) view4).w(ut7.a(intValue), true);
                                        if (Z != xt7Var3.Z()) {
                                            xt7Var3.n.g3.O(true);
                                        }
                                        ge7 ge7Var3 = xt7Var3.f;
                                        if (ge7Var3 != null) {
                                            ge7Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        boolean Z2 = xt7Var3.Z();
                                        int intValue2 = num4.intValue();
                                        ut7Var4.b = intValue2;
                                        ((skb) view4).w(ut7.a(intValue2), true);
                                        if (Z2 != xt7Var3.Z()) {
                                            xt7Var3.n.g3.O(true);
                                        }
                                        ge7 ge7Var4 = xt7Var3.f;
                                        if (ge7Var4 != null) {
                                            ge7Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i20 == 2) {
                        arrayList3.remove(i);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new ut7(0, 1439));
                        }
                        xt7Var2.n.g3.O(true);
                        ge7 ge7Var3 = xt7Var2.f;
                        if (ge7Var3 != null) {
                            ge7Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void p(int i) {
        sp7 sp7Var = (sp7) this.b;
        if (sp7Var.f == null && !sp7Var.h.e()) {
            sp7Var.n.c.c();
        }
        sp7Var.f();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((em6) this.b).b0();
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        boolean z4 = MusicPlayerService.s;
        if (z && !TextUtils.isEmpty(musicPlayerService.n)) {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null) {
                musicPlayerService.a(r47Var, true);
            }
            musicPlayerService.n = null;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        xm9 xm9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 20:
                ((up7) obj).run();
                return;
            case 22:
                aq7 aq7Var = ((xp7) obj).b;
                SparseArray sparseArray = aq7Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    yp7 yp7Var = (yp7) sparseArray.valueAt(i2);
                    TLRPC.Document document = yp7Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wm9 wm9Var = aq7Var.getMediaDataController().A0;
                        TLRPC.Document document2 = yp7Var.e;
                        ArrayList arrayList2 = wm9Var.e;
                        if (document2 != null) {
                            if (!wm9Var.f) {
                                wm9Var.f(true);
                                wm9Var.f = true;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayList2.size()) {
                                    if (((vm9) arrayList2.get(i3)).a != null && ((vm9) arrayList2.get(i3)).a.id == document2.id) {
                                        arrayList2.remove(i3);
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (yp7Var.g != null && (xm9Var = (xm9) aq7Var.getMediaDataController().a0.get(yp7Var.g)) != null) {
                        xm9Var.c = true;
                        xm9Var.a();
                        int i4 = xm9Var.a;
                        xb4 G = xb4.G(i4);
                        String str = xm9Var.b;
                        G.b(str, false);
                        ls6.d0(i4).j1(str, null, true);
                    }
                    if (yp7Var == aq7Var.H) {
                        aq7Var.N = null;
                        aq7Var.H = (yp7) aq7Var.b.get(0);
                        aq7Var.I = true;
                    }
                    aq7Var.a.remove(yp7Var);
                    aq7Var.c.remove(yp7Var);
                }
                aq7Var.getMediaDataController().A0.h();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i5);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.id = tL_inputDocument;
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    aq7Var.getConnectionsManager().sendRequest(saveringtone, new xe2((byte) 0));
                }
                aq7Var.c0();
                aq7Var.h0();
                aq7Var.e.f();
                idVar.dismiss();
                return;
            case 27:
                ((xw7) obj).a.d2.p();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                xea.r = "";
                xea.w = false;
                xea.x();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.c.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i6);
                        if (childAt instanceof qmb) {
                            yob.X(((qmb) childAt).getTextView(), aob.E6, null);
                        } else {
                            i6++;
                        }
                    }
                }
                jn7.e().k(51, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        a77 a77Var = (a77) this.b;
        if (z) {
            long j = i;
            if (a77Var.w1 != j) {
                a77Var.w1 = j;
                a77Var.q1.setText(a77.G0(j));
            }
            a77Var.F0(true);
        }
    }

    public bm6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void v0(float f, int i) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
