package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class ly3 extends nx0 implements fn7 {
    public static Pattern P1;
    public n8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final mm G1;
    public final wx3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final e m1;
    public final t62 n1;
    public final xx3 o1;
    public final dy3 p1;
    public final iw q1;
    public by3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final ok8 w1;
    public final u55 x1;
    public final hw6 y1;
    public final di2 z1;

    public ly3(org.telegram.ui.ActionBar.e r21, android.content.Context r22, defpackage.vnb r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly3.<init>(org.telegram.ui.ActionBar.e, android.content.Context, vnb, java.util.ArrayList):void");
    }

    public static void F0(final e eVar, TLObject tLObject, final boolean z, final zo2 zo2Var, final lw3 lw3Var) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet = null;
        if (eVar == null) {
            currentAccount = yac.t0;
            fragmentView = null;
        } else {
            currentAccount = eVar.getCurrentAccount();
            fragmentView = eVar.getFragmentView();
        }
        final int i = currentAccount;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                Runnable runnable = (Runnable) ls6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (zo2Var != null) {
                        zo2Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.id = stickerSet2.id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z2 = z;
                        final View view = fragmentView;
                        final e eVar2 = eVar;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i2 = i;
                        final zo2 zo2Var2 = zo2Var;
                        final lw3 lw3Var2 = lw3Var;
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                int i3;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i3 = 1;
                                } else if (stickerSet4.emojis) {
                                    i3 = 5;
                                } else {
                                    i3 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                e eVar3 = eVar2;
                                int i4 = i2;
                                zo2 zo2Var3 = zo2Var2;
                                try {
                                    if (tL_error2 == null) {
                                        if (z2 && view2 != null) {
                                            Context context = eVar3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            v21.g(eVar3, new l3b(context, tLObject3, 1, 2, null, eVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            ls6.d0(i4).C1(eVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (zo2Var3 != null) {
                                            zo2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(eVar3.getFragmentView().getContext(), ob6.M0(2131751070, null), 0).show();
                                        if (zo2Var3 != null) {
                                            zo2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (zo2Var3 != null) {
                                        zo2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                ls6.d0(i4).c1(i3, false, true, false, new zj3(lw3Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final int E0() {
        if (this.b == null) {
            return 0;
        }
        iw iwVar = this.q1;
        if (iwVar != null && iwVar.getChildCount() >= 1) {
            View childAt = iwVar.getChildAt(0);
            t62 t62Var = this.n1;
            if (childAt != t62Var) {
                return this.b.getPaddingTop();
            }
            return t62Var.getBottom() + ((int) iwVar.getY());
        }
        return this.b.getPaddingTop();
    }

    public final void I0() {
        e eVar = this.m1;
        if (eVar != null) {
            new xk8(eVar, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void J0() {
        ArrayList arrayList;
        boolean z;
        int i;
        TLRPC.StickerSet stickerSet;
        if (this.t1 == null) {
            return;
        }
        xx3 xx3Var = this.o1;
        if (xx3Var.b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(xx3Var.b);
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == null) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        ls6 d0 = ls6.d0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!d0.D0(stickerSet.id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (xx3Var.a != null && arrayList.size() == xx3Var.a.size()) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 2;
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new az1(this, (byte) 19));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(k43.h);
            this.L1.start();
        }
        this.M1 = z;
        iw iwVar = this.q1;
        if (!z) {
            iwVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                if (K0 < E) {
                    i = 0;
                } else {
                    i = 1;
                }
                hw6 hw6Var = this.y1;
                hw6Var.b = i;
                hw6Var.k(E, (hl.q.y / 2) - hl.L(170.0f), false, false);
            } else {
                iwVar.A0(E);
            }
            this.E1 = this.r1.E(this.I1);
            by3 by3Var = this.r1;
            int i5 = this.I1;
            ly3 ly3Var = by3Var.c;
            boolean z2 = ly3Var.C1;
            xx3 xx3Var2 = ly3Var.o1;
            if (!z2) {
                i4 = 1;
            }
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (xx3Var2.c.length > 1) {
                    size = Math.min(ly3Var.x1.J << 1, size);
                }
                if (i6 == i5) {
                    i4 = i4 + size + 1;
                    break;
                } else {
                    i4 += size + 2;
                    i6++;
                }
            }
            this.F1 = i4;
            this.G1.e(true, 1.0f);
            iwVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        ok8 ok8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (z3 && !this.B1) {
            ok8Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView.setVisibility(0);
                textView2.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView.setText(ob6.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(ob6.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final ly3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        zo2 zo2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        ly3 ly3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    e eVar = ly3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        zo2Var = new zo2(ly3Var2, iArr, size2, arrayList5);
                                    } else {
                                        zo2Var = null;
                                    }
                                    ly3.F0(eVar, tLObject, z4, zo2Var, null);
                                    i9++;
                                }
                                ly3Var2.G0(true);
                                if (size2 <= 1) {
                                    ly3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                ly3Var2.dismiss();
                                e eVar2 = ly3Var2.m1;
                                ArrayList arrayList6 = arrayList4;
                                if (eVar2 != null) {
                                    ls6 d02 = ls6.d0(eVar2.getCurrentAccount());
                                    Context context = eVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) c00.g(1, arrayList6)) != null) {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i7 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i7 = 5;
                                        } else {
                                            i7 = 0;
                                        }
                                        for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                        }
                                        ?? r7 = new int[arrayList6.size()];
                                        int i11 = 0;
                                        while (i11 < arrayListArr2[i7].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i7].get(i11);
                                            int i12 = i9;
                                            while (true) {
                                                if (i12 < arrayList6.size()) {
                                                    i8 = i9;
                                                    z6 = z7;
                                                    if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                        r7[i12] = i11;
                                                        arrayListArr2[i7].remove(i11);
                                                        d02.J.l(tL_messages_stickerSet3.set.id);
                                                        d02.K.l(tL_messages_stickerSet3.set.id);
                                                        d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i12++;
                                                        i9 = i8;
                                                        z7 = z6;
                                                    }
                                                } else {
                                                    i8 = i9;
                                                    z6 = z7;
                                                }
                                            }
                                            i11++;
                                            i9 = i8;
                                            z7 = z6;
                                        }
                                        boolean z8 = i9;
                                        int i13 = z7;
                                        ArrayList arrayList7 = arrayListArr2[i7];
                                        int i14 = d02.Z[i7];
                                        long[] jArr = d02.Y;
                                        int i15 = i7;
                                        long s = ls6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        jn7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(61, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        l3b l3bVar = new l3b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, eVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        t21 t21Var = new t21(null, context, z8);
                                        t21Var.b = new fd6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        t21Var.c = new wt2(d02, (boolean[]) r15, arrayList6, context, eVar2, i15);
                                        l3bVar.setButton(t21Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id, new z96(t21Var, (byte) 17));
                                        }
                                        v21.g(eVar2, l3bVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = ly3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            ls6.d0(yac.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                ly3Var2.G0(false);
                                return;
                        }
                    }
                });
                L0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView.setVisibility(8);
                textView2.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView2.setText(ob6.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(ob6.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final ly3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        zo2 zo2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        ly3 ly3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    e eVar = ly3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        zo2Var = new zo2(ly3Var2, iArr, size2, arrayList5);
                                    } else {
                                        zo2Var = null;
                                    }
                                    ly3.F0(eVar, tLObject, z4, zo2Var, null);
                                    i9++;
                                }
                                ly3Var2.G0(true);
                                if (size2 <= 1) {
                                    ly3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                ly3Var2.dismiss();
                                e eVar2 = ly3Var2.m1;
                                ArrayList arrayList6 = arrayList2;
                                if (eVar2 != null) {
                                    ls6 d02 = ls6.d0(eVar2.getCurrentAccount());
                                    Context context = eVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) c00.g(1, arrayList6)) != null) {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i7 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i7 = 5;
                                        } else {
                                            i7 = 0;
                                        }
                                        for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                        }
                                        ?? r7 = new int[arrayList6.size()];
                                        int i11 = 0;
                                        while (i11 < arrayListArr2[i7].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i7].get(i11);
                                            int i12 = i9;
                                            while (true) {
                                                if (i12 < arrayList6.size()) {
                                                    i8 = i9;
                                                    z6 = z7;
                                                    if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                        r7[i12] = i11;
                                                        arrayListArr2[i7].remove(i11);
                                                        d02.J.l(tL_messages_stickerSet3.set.id);
                                                        d02.K.l(tL_messages_stickerSet3.set.id);
                                                        d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i12++;
                                                        i9 = i8;
                                                        z7 = z6;
                                                    }
                                                } else {
                                                    i8 = i9;
                                                    z6 = z7;
                                                }
                                            }
                                            i11++;
                                            i9 = i8;
                                            z7 = z6;
                                        }
                                        boolean z8 = i9;
                                        int i13 = z7;
                                        ArrayList arrayList7 = arrayListArr2[i7];
                                        int i14 = d02.Z[i7];
                                        long[] jArr = d02.Y;
                                        int i15 = i7;
                                        long s = ls6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        jn7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(61, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        l3b l3bVar = new l3b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, eVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        t21 t21Var = new t21(null, context, z8);
                                        t21Var.b = new fd6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        t21Var.c = new wt2(d02, (boolean[]) r15, arrayList6, context, eVar2, i15);
                                        l3bVar.setButton(t21Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id, new z96(t21Var, (byte) 17));
                                        }
                                        v21.g(eVar2, l3bVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = ly3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            ls6.d0(yac.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                ly3Var2.G0(false);
                                return;
                        }
                    }
                });
                L0(true);
                return;
            } else {
                textView.setVisibility(8);
                textView2.setVisibility(8);
                L0(false);
                return;
            }
        }
        ok8Var.setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        L0(false);
    }

    public final void K0(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (hl.B(aob.v0(aob.h5, this.J0)) > 0.721f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hl.B(aob.v(aob.v0(aob.s8, this.J0), 855638016)) > 0.721f) {
            z3 = true;
        }
        if (!z) {
            z2 = z3;
        }
        hl.l3(this, z2);
    }

    public final void L0(boolean z) {
        boolean z2;
        float f;
        float L;
        float f2;
        float L2;
        float f3;
        float f4;
        int i = 0;
        if (!this.J1 && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.v1.getVisibility() == 0) {
            i = hl.L(19.0f);
        }
        float f5 = i;
        boolean z3 = this.B1;
        iw iwVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z) {
                L2 = f5;
            } else {
                L2 = hl.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f3).setDuration(250L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z) {
                f4 = -(hl.L(68.0f) - f5);
            } else {
                f4 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f4);
            if (!z) {
                f6 = 0.0f;
            }
            translationY2.alpha(f6).setDuration(250L).setInterpolator(k43Var).start();
            ViewPropertyAnimator animate3 = iwVar.animate();
            if (!z3 && !z) {
                f7 = hl.L(68.0f) - f5;
            }
            animate3.translationY(f7).setDuration(250L).setInterpolator(k43Var).start();
        } else {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            frameLayout.setAlpha(f);
            if (z) {
                L = f5;
            } else {
                L = hl.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z) {
                f6 = 0.0f;
            }
            view.setAlpha(f6);
            if (z) {
                f2 = -(hl.L(68.0f) - f5);
            } else {
                f2 = 0.0f;
            }
            view.setTranslationY(f2);
            if (!z3 && !z) {
                f7 = hl.L(68.0f) - f5;
            }
            iwVar.setTranslationY(f7);
        }
        this.J1 = z;
    }

    @Override
    public final int P() {
        int measuredHeight;
        int i = 0;
        iw iwVar = this.q1;
        if (iwVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = iwVar.getMeasuredHeight();
        }
        int E0 = measuredHeight - E0();
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            i = viewGroup.getPaddingTop();
        }
        return hl.L(8.0f) + E0 + i + hl.n;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        hy3 hy3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i == jn7.x0) {
            int i3 = 0;
            while (true) {
                iw iwVar = this.q1;
                if (i3 < iwVar.getChildCount()) {
                    View childAt = iwVar.getChildAt(i3);
                    if ((childAt instanceof hy3) && (tL_messages_stickerSet = (hy3Var = (hy3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                        hy3Var.a(ls6.d0(this.a).D0(hy3Var.r.set.id, true), true);
                    }
                    i3++;
                } else {
                    J0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        dy3 dy3Var = this.p1;
        if (dy3Var != null && dy3Var.x) {
            dy3Var.x = false;
            dy3Var.invalidate();
        }
        super.dismiss();
        xx3 xx3Var = this.o1;
        if (xx3Var != null) {
            jn7.f(xx3Var.d).n(xx3Var, jn7.B0);
        }
        jn7.e().k(jn7.k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.x0);
    }

    @Override
    public final void onBackPressed() {
        if (rw2.e().E) {
            rw2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.x0);
    }

    @Override
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            di2 di2Var = this.z1;
            if (di2Var != null) {
                di2Var.b(aob.v0(aob.Fi, this.J0));
            }
            dy3 dy3Var = this.p1;
            if (dy3Var != null && (bool = dy3Var.c) != null) {
                K0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        nr1 nr1Var;
        super.show();
        by3 by3Var = new by3(this);
        this.r1 = by3Var;
        this.q1.setAdapter(by3Var);
        jn7.e().k(jn7.j1, 4);
        xx3 xx3Var = this.o1;
        if (!xx3Var.e) {
            xx3Var.e = true;
            ly3 ly3Var = xx3Var.f;
            int i = xx3Var.d;
            xx3Var.b = new ArrayList(xx3Var.a.size());
            xx3Var.c = new ArrayList[xx3Var.a.size()];
            jn7.f(i).b(xx3Var, 65);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < xx3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = ls6.d0(i).m0((TLRPC.InputStickerSet) xx3Var.a.get(i2), null, false, false, new rx1(xx3Var, zArr, (byte) 16));
                    if (xx3Var.c.length == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        hl.c3(new iy3(xx3Var, (byte) 0));
                        Context context = ly3Var.getContext();
                        e eVar = ly3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) xx3Var.a.get(i2);
                        e eVar2 = ly3Var.m1;
                        if (eVar2 instanceof zu1) {
                            nr1Var = ((zu1) eVar2).a0;
                        } else {
                            nr1Var = null;
                        }
                        new s4b(context, eVar, inputStickerSet, null, nr1Var, ly3Var.J0).show();
                    } else {
                        xx3Var.b.add(m0);
                        xx3Var.a(i2, m0);
                        i2++;
                    }
                } else {
                    ly3 ly3Var2 = xx3Var.h;
                    ly3Var2.J0();
                    iw iwVar = ly3Var2.q1;
                    if (iwVar != null && iwVar.getAdapter() != null) {
                        iwVar.getAdapter().f();
                    }
                }
            }
        }
        J0();
        e eVar3 = this.m1;
        if (eVar3 == null) {
            currentAccount = yac.t0;
        } else {
            currentAccount = eVar3.getCurrentAccount();
        }
        ls6.d0(currentAccount).D(5);
    }

    public void H0() {
    }

    public void G0(boolean z) {
    }
}
