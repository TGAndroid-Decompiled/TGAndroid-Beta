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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ProfileActivity;
public final class cj6 implements g94, xj4, e6b, sx6, fu2, lz6, iz6, h59, gk, ni7, pk6, oac, ln5, au9, ee, a7c, id1, ku4, e56 {
    public final byte a;
    public final Object b;

    public cj6(r7a r7aVar) {
        this.a = (byte) 4;
        Bundle bundle = Bundle.EMPTY;
        this.b = r7aVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ej6 ej6Var = (ej6) obj;
                ej6Var.setScaleX(gm.R1(1.0f, 1.019f, f));
                ej6Var.setScaleY(gm.R1(1.0f, 1.019f, f));
                return;
            default:
                ((cm6) obj).c0();
                return;
        }
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final void V(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final void accept(Object obj) {
        ((cf8) obj).b((ce8) this.b);
    }

    @Override
    public final void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
        boolean z4 = MusicPlayerService.s;
        if (z && !TextUtils.isEmpty(musicPlayerService.n)) {
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null) {
                musicPlayerService.a(k47Var, true);
            }
            musicPlayerService.n = null;
        }
    }

    @Override
    public final void c() {
        ((i58) this.b).D0(true);
    }

    @Override
    public final void d(rw6 rw6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                Bundle bundle = Bundle.EMPTY;
                rw6Var.a(i, (r7a) obj);
                return;
            default:
                rw6Var.f(i, (ne8) obj);
                return;
        }
    }

    @Override
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        ((fu2) this.b).accept(cf8Var);
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final Object f(Object obj, Object obj2) {
        return wpe.b((List) ((Collection) obj2), new lk6(((aj7) this.b).f, obj));
    }

    @Override
    public final boolean g(int i, View view) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                final t67 t67Var = (t67) obj;
                if (i >= t67Var.J && i < t67Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final k47 k47Var = (k47) t67Var.y.get(i - t67Var.J);
                    final long B0 = k47.B0(k47Var.k);
                    final boolean D = pg3.D(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t67Var.getResourceProvider(), t67Var.getParentActivity());
                    if (k47Var.w4()) {
                        if (D) {
                            i2 = 2131747519;
                        } else {
                            i2 = 2131747544;
                        }
                        arrayList.add(jb6.M0(i2, null));
                        if (D) {
                            i3 = 2131232272;
                        } else {
                            i3 = 2131232094;
                        }
                        arrayList3.add(Integer.valueOf(i3));
                    } else {
                        b10.r(null, 2131743234, arrayList, 2131232261, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = gm.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        iArr[i4] = ((Integer) arrayList3.get(i4)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            d ga;
                            k47 k47Var2 = k47Var;
                            boolean w4 = k47Var2.w4();
                            d dVar = t67.this;
                            boolean z = D;
                            long j = B0;
                            if (w4) {
                                if (z) {
                                    ga = ProfileActivity.S2(j);
                                } else {
                                    ga = yv1.ga(j);
                                }
                                dVar.presentFragment(ga);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z) {
                                bundle.putLong("user_id", j);
                            } else {
                                bundle.putLong("chat_id", -j);
                            }
                            bundle.putInt("message_id", k47Var2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                                dVar.presentFragment(new yv1(bundle));
                            }
                        }
                    };
                    he heVar = alertDialog$Builder.a;
                    heVar.Q = charSequenceArr;
                    heVar.R = iArr;
                    heVar.N = onClickListener;
                    t67Var.showDialog(heVar);
                }
                return false;
            default:
                ep7 ep7Var = (ep7) obj;
                if (view instanceof dp7) {
                    dp7 dp7Var = (dp7) view;
                    ep7Var.c0(dp7Var.e);
                    dp7Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public final long get() {
        return ((k44) this.b).E();
    }

    @Override
    public final void h() {
        float f;
        z8b z8bVar = (z8b) this.b;
        TextView textView = z8bVar.e1;
        boolean a = z8bVar.t0.a();
        ImageView imageView = z8bVar.d1;
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
    public final void j(float f) {
        ym6 ym6Var = (ym6) this.b;
        cdc cdcVar = ym6Var.f1.b;
        if (cdcVar.f != f) {
            cdcVar.f = f;
            cdcVar.c(false);
        }
        ym6Var.G0(ym6Var.d0);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i;
        rs7 rs7Var;
        rs7 rs7Var2;
        int i2;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 14:
                r8b r8bVar = (r8b) obj3;
                c6c c6cVar = (c6c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                int i3 = c6cVar.d;
                g6b g6bVar = (g6b) c6cVar.H;
                r8bVar.c(false, true);
                v9b v9bVar = r8bVar.P;
                if (g6bVar != v9bVar.L1 && !v9bVar.Y1) {
                    v9bVar.e1.setSelected(i3);
                    v9bVar.Y1 = true;
                    ge7 ge7Var = new ge7(v9bVar, i3, (byte) 20);
                    z8b z8bVar = v9bVar.w1;
                    g6b g6bVar2 = v9bVar.L1;
                    if (z8bVar != null && g6bVar2 != null) {
                        if (!z8bVar.r0()) {
                            ge7Var.run();
                            return;
                        }
                        g6bVar2.f();
                        Utilities.g.c(new i4a(v9bVar, z8bVar, g6bVar2.i0, g6bVar2.j0, g6bVar2, z8bVar.E0.getPainting().E, z8bVar.r0(), ge7Var, (byte) 1));
                        return;
                    }
                    ge7Var.run();
                    return;
                }
                return;
            case 21:
                ss7 ss7Var = (ss7) obj3;
                c6c c6cVar2 = (c6c) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f3 = (Float) serializable2;
                int i4 = c6cVar2.d;
                if (i4 == -1) {
                    boolean z = !ss7Var.d;
                    ss7Var.d = z;
                    ((bjb) view2).setChecked(z);
                    ss7Var.a.g3.O(true);
                    ss7Var.a0(true);
                    return;
                } else if (i4 == -2) {
                    ?? dVar = new d(null);
                    dVar.n = ss7Var.n;
                    dVar.c = new u35(ss7Var, view2, (byte) 14);
                    ss7Var.presentFragment((d) dVar);
                    return;
                } else if (c6cVar2.a == 5 && i4 >= 0 && i4 < ss7Var.f.length) {
                    if (!jb6.a0 ? floatValue >= view2.getMeasuredWidth() - gm.L(76.0f) : floatValue <= gm.L(76.0f)) {
                        if (ss7Var.f[c6cVar2.d].isEmpty()) {
                            ((yn7) view2).setChecked(true);
                            ss7Var.f[c6cVar2.d].add(new rs7(0, 1439));
                            ss7Var.Z(c6cVar2.d);
                        } else {
                            ss7Var.f[c6cVar2.d].clear();
                            ((yn7) view2).setChecked(false);
                        }
                        ((yn7) view2).setValue(ss7.d0(ss7Var.f[c6cVar2.d]));
                        ss7Var.a0(true);
                        return;
                    }
                    int i5 = (c6cVar2.d + 6) % 7;
                    int i6 = 0;
                    for (int i7 = 0; i7 < ss7Var.f[i5].size(); i7++) {
                        if (((rs7) ss7Var.f[i5].get(i7)).b > i6) {
                            i6 = ((rs7) ss7Var.f[i5].get(i7)).b;
                        }
                    }
                    int max = Math.max(0, i6 - 1439);
                    int i8 = (c6cVar2.d + 1) % 7;
                    int i9 = 1440;
                    for (int i10 = 0; i10 < ss7Var.f[i8].size(); i10++) {
                        if (((rs7) ss7Var.f[i8].get(i10)).a < i9) {
                            i9 = ((rs7) ss7Var.f[i8].get(i10)).a;
                        }
                    }
                    int i11 = i9 + 1439;
                    CharSequence charSequence = c6cVar2.m;
                    ArrayList arrayList = ss7Var.f[c6cVar2.d];
                    int i12 = 0;
                    for (int i13 = 0; i13 < 7; i13++) {
                        ArrayList arrayList2 = ss7Var.f[i13];
                        if (arrayList2 != null) {
                            i12 = Math.max(1, arrayList2.size()) + i12;
                        }
                    }
                    us7 us7Var = new us7(charSequence, arrayList, max, i11, 28 - i12);
                    us7Var.f = new kl7(ss7Var, (byte) 7);
                    us7Var.h = new bl7(ss7Var, c6cVar2, (byte) 14);
                    ss7Var.presentFragment(us7Var);
                    return;
                } else {
                    return;
                }
            case 22:
                final us7 us7Var2 = (us7) obj3;
                c6c c6cVar3 = (c6c) obj;
                final View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f4 = (Float) serializable;
                Float f5 = (Float) serializable2;
                int i14 = us7Var2.c;
                int i15 = us7Var2.d;
                ArrayList arrayList3 = us7Var2.b;
                int i16 = c6cVar3.d;
                if (i16 == -1) {
                    us7Var2.r = !us7Var2.r;
                    arrayList3.clear();
                    if (us7Var2.r) {
                        arrayList3.add(new rs7(0, 1439));
                    }
                    bjb bjbVar = (bjb) view3;
                    boolean z2 = us7Var2.r;
                    c6cVar3.e = z2;
                    bjbVar.setChecked(z2);
                    boolean z3 = us7Var2.r;
                    if (z3) {
                        i2 = cmb.e6;
                    } else {
                        i2 = cmb.d6;
                    }
                    bjbVar.b(cmb.w0(null, i2, false), z3);
                    us7Var2.n.g3.O(true);
                    kl7 kl7Var = us7Var2.f;
                    if (kl7Var != null) {
                        kl7Var.run();
                        return;
                    }
                    return;
                } else if (i16 == -2) {
                    if (!arrayList3.isEmpty() && !us7Var2.Z()) {
                        int i17 = ((rs7) b10.f(1, arrayList3)).b;
                        int j = Utilities.j(i17 + 30, i15 - 1, i14);
                        arrayList3.add(new rs7(j, Utilities.j((i17 + 1560) / 2, i15, j + 1)));
                    } else {
                        if (us7Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j2 = Utilities.j(480, i15 - 1, i14);
                        arrayList3.add(new rs7(j2, Utilities.j(1200, i15, j2 + 1)));
                    }
                    kl7 kl7Var2 = us7Var2.f;
                    if (kl7Var2 != null) {
                        kl7Var2.run();
                    }
                    us7Var2.n.g3.O(true);
                    return;
                } else if (c6cVar3.a == 3 && (i = i16 / 3) >= 0 && i < arrayList3.size()) {
                    int i18 = i - 1;
                    if (i18 >= 0) {
                        rs7Var = (rs7) arrayList3.get(i18);
                    } else {
                        rs7Var = null;
                    }
                    final rs7 rs7Var3 = (rs7) arrayList3.get(i);
                    int i19 = i + 1;
                    if (i19 < arrayList3.size()) {
                        rs7Var2 = (rs7) arrayList3.get(i19);
                    } else {
                        rs7Var2 = null;
                    }
                    int i20 = c6cVar3.d % 3;
                    if (i20 == 0) {
                        Activity parentActivity = us7Var2.getParentActivity();
                        String M0 = jb6.M0(2131752703, null);
                        int i21 = rs7Var3.a;
                        if (rs7Var != null) {
                            i14 = rs7Var.b + 1;
                        }
                        ik.U(parentActivity, M0, i21, i14, rs7Var3.b - 1, new qac() {
                            @Override
                            public final void a(Object obj4) {
                                byte b2 = r4;
                                rs7 rs7Var4 = rs7Var3;
                                View view4 = view3;
                                us7 us7Var3 = us7Var2;
                                Integer num4 = (Integer) obj4;
                                switch (b2) {
                                    case 0:
                                        boolean a0 = us7Var3.a0();
                                        int intValue = num4.intValue();
                                        rs7Var4.a = intValue;
                                        ((xib) view4).w(rs7.a(intValue), true);
                                        if (a0 != us7Var3.a0()) {
                                            us7Var3.n.g3.O(true);
                                        }
                                        kl7 kl7Var3 = us7Var3.f;
                                        if (kl7Var3 != null) {
                                            kl7Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        boolean a02 = us7Var3.a0();
                                        int intValue2 = num4.intValue();
                                        rs7Var4.b = intValue2;
                                        ((xib) view4).w(rs7.a(intValue2), true);
                                        if (a02 != us7Var3.a0()) {
                                            us7Var3.n.g3.O(true);
                                        }
                                        kl7 kl7Var4 = us7Var3.f;
                                        if (kl7Var4 != null) {
                                            kl7Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i20 == 1) {
                        Activity parentActivity2 = us7Var2.getParentActivity();
                        String M02 = jb6.M0(2131752709, null);
                        int i22 = rs7Var3.b;
                        int i23 = rs7Var3.a + 1;
                        if (rs7Var2 != null) {
                            i15 = rs7Var2.a - 1;
                        }
                        ik.U(parentActivity2, M02, i22, i23, i15, new qac() {
                            @Override
                            public final void a(Object obj4) {
                                byte b2 = r4;
                                rs7 rs7Var4 = rs7Var3;
                                View view4 = view3;
                                us7 us7Var3 = us7Var2;
                                Integer num4 = (Integer) obj4;
                                switch (b2) {
                                    case 0:
                                        boolean a0 = us7Var3.a0();
                                        int intValue = num4.intValue();
                                        rs7Var4.a = intValue;
                                        ((xib) view4).w(rs7.a(intValue), true);
                                        if (a0 != us7Var3.a0()) {
                                            us7Var3.n.g3.O(true);
                                        }
                                        kl7 kl7Var3 = us7Var3.f;
                                        if (kl7Var3 != null) {
                                            kl7Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        boolean a02 = us7Var3.a0();
                                        int intValue2 = num4.intValue();
                                        rs7Var4.b = intValue2;
                                        ((xib) view4).w(rs7.a(intValue2), true);
                                        if (a02 != us7Var3.a0()) {
                                            us7Var3.n.g3.O(true);
                                        }
                                        kl7 kl7Var4 = us7Var3.f;
                                        if (kl7Var4 != null) {
                                            kl7Var4.run();
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
                            arrayList3.add(new rs7(0, 1439));
                        }
                        us7Var2.n.g3.O(true);
                        kl7 kl7Var3 = us7Var2.f;
                        if (kl7Var3 != null) {
                            kl7Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                Integer num4 = (Integer) number;
                Float f6 = (Float) serializable;
                Float f7 = (Float) serializable2;
                ((PasskeysActivity) obj3).d0((c6c) obj, (View) obj2);
                return;
        }
    }

    @Override
    public final Object l(Object obj) {
        ah7 ah7Var = (ah7) obj;
        return Float.valueOf(((xk4) this.b).a / 100.0f);
    }

    @Override
    public final Bitmap n(BitmapFactory.Options options) {
        jo6 jo6Var = (jo6) this.b;
        String str = jo6Var.i;
        if (str == null) {
            str = jo6Var.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public final void o(int i) {
        wo7 wo7Var = (wo7) this.b;
        if (wo7Var.f == null && !wo7Var.h.e()) {
            wo7Var.n.c.c();
        }
        wo7Var.f();
    }

    @Override
    public final void r(he heVar, int i) {
        ll9 ll9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 18:
                ((yo7) obj).run();
                return;
            case 20:
                ep7 ep7Var = ((bp7) obj).b;
                SparseArray sparseArray = ep7Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    cp7 cp7Var = (cp7) sparseArray.valueAt(i2);
                    TLRPC.Document document = cp7Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        kl9 kl9Var = ep7Var.getMediaDataController().A0;
                        TLRPC.Document document2 = cp7Var.e;
                        ArrayList arrayList2 = kl9Var.e;
                        if (document2 != null) {
                            if (!kl9Var.f) {
                                kl9Var.f(true);
                                kl9Var.f = true;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayList2.size()) {
                                    if (((jl9) arrayList2.get(i3)).a != null && ((jl9) arrayList2.get(i3)).a.id == document2.id) {
                                        arrayList2.remove(i3);
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (cp7Var.g != null && (ll9Var = (ll9) ep7Var.getMediaDataController().a0.get(cp7Var.g)) != null) {
                        ll9Var.c = true;
                        ll9Var.a();
                        int i4 = ll9Var.a;
                        bc4 G = bc4.G(i4);
                        String str = ll9Var.b;
                        G.b(str, false);
                        hs6.d0(i4).j1(str, null, true);
                    }
                    if (cp7Var == ep7Var.H) {
                        ep7Var.N = null;
                        ep7Var.H = (cp7) ep7Var.b.get(0);
                        ep7Var.I = true;
                    }
                    ep7Var.a.remove(cp7Var);
                    ep7Var.c.remove(cp7Var);
                }
                ep7Var.getMediaDataController().A0.h();
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
                    ep7Var.getConnectionsManager().sendRequest(saveringtone, new nf2((byte) 0));
                }
                ep7Var.d0();
                ep7Var.i0();
                ep7Var.e.f();
                heVar.dismiss();
                return;
            case 25:
                ((rv7) obj).a.j2.p();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                gda.r = "";
                gda.w = false;
                gda.x();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.c.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i6);
                        if (childAt instanceof vkb) {
                            anb.X(((vkb) childAt).getTextView(), cmb.D6, null);
                        } else {
                            i6++;
                        }
                    }
                }
                nm7.e().k(51, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                iz6 iz6Var = (iz6) obj;
                if (tx6Var.i()) {
                    return ao5.b;
                }
                tx6Var.t();
                iz6Var.e(tx6Var.t, sw6Var);
                oz6.W(tx6Var, sw6Var, i, new q8a(0));
                return ao5.b;
            default:
                return tx6Var.o(sw6Var, mo5.u((bt6) obj), -1, -9223372036854775807L);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        u67 u67Var = (u67) this.b;
        if (z) {
            long j = i;
            if (u67Var.w1 != j) {
                u67Var.w1 = j;
                u67Var.q1.setText(u67.F0(j));
            }
            u67Var.E0(true);
        }
    }

    public cj6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void m() {
    }

    private final void p(float f, int i) {
    }

    private final void q(float f, int i) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
