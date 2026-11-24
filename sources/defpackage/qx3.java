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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class qx3 extends fx0 implements gk7 {
    public static Pattern P1;
    public m8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final lm G1;
    public final ax3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final d m1;
    public final d62 n1;
    public final bx3 o1;
    public final hx3 p1;
    public final hw q1;
    public fx3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final ah8 w1;
    public final r35 x1;
    public final cu6 y1;
    public final ih2 z1;

    public qx3(org.telegram.ui.ActionBar.d r21, android.content.Context r22, defpackage.wjb r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.<init>(org.telegram.ui.ActionBar.d, android.content.Context, wjb, java.util.ArrayList):void");
    }

    public static void E0(final d dVar, TLObject tLObject, final boolean z, final go2 go2Var, final li3 li3Var) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet = null;
        if (dVar == null) {
            currentAccount = y6c.t0;
            fragmentView = null;
        } else {
            currentAccount = dVar.getCurrentAccount();
            fragmentView = dVar.getFragmentView();
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
                Runnable runnable = (Runnable) hq6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (go2Var != null) {
                        go2Var.a(Boolean.TRUE);
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
                        final d dVar2 = dVar;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i2 = i;
                        final go2 go2Var2 = go2Var;
                        final li3 li3Var2 = li3Var;
                        gl.d3(new Runnable() {
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
                                d dVar3 = dVar2;
                                int i4 = i2;
                                go2 go2Var3 = go2Var2;
                                try {
                                    if (tL_error2 == null) {
                                        if (z2 && view2 != null) {
                                            Context context = dVar3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            m21.g(dVar3, new nza(context, tLObject3, 1, 2, null, dVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            hq6.d0(i4).C1(dVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (go2Var3 != null) {
                                            go2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(dVar3.getFragmentView().getContext(), k96.M0(2131751093, null), 0).show();
                                        if (go2Var3 != null) {
                                            go2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (go2Var3 != null) {
                                        go2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                hq6.d0(i4).c1(i3, false, true, false, new hj3(li3Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    public final int D0() {
        if (this.b == null) {
            return 0;
        }
        hw hwVar = this.q1;
        if (hwVar != null && hwVar.getChildCount() >= 1) {
            View childAt = hwVar.getChildAt(0);
            d62 d62Var = this.n1;
            if (childAt != d62Var) {
                return this.b.getPaddingTop();
            }
            return d62Var.getBottom() + ((int) hwVar.getY());
        }
        return this.b.getPaddingTop();
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void H0() {
        d dVar = this.m1;
        if (dVar != null) {
            new jh8(dVar, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void I0() {
        ArrayList arrayList;
        boolean z;
        int i;
        TLRPC.StickerSet stickerSet;
        if (this.t1 == null) {
            return;
        }
        bx3 bx3Var = this.o1;
        if (bx3Var.b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(bx3Var.b);
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == null) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        hq6 d0 = hq6.d0(this.a);
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
        if (bx3Var.a != null && arrayList.size() == bx3Var.a.size()) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 2;
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new uz1(this, (byte) 18));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(s33.h);
            this.L1.start();
        }
        this.M1 = z;
        hw hwVar = this.q1;
        if (!z) {
            hwVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                if (K0 < E) {
                    i = 0;
                } else {
                    i = 1;
                }
                cu6 cu6Var = this.y1;
                cu6Var.b = i;
                cu6Var.k(E, (gl.q.y / 2) - gl.L(170.0f), false, false);
            } else {
                hwVar.z0(E);
            }
            this.E1 = this.r1.E(this.I1);
            fx3 fx3Var = this.r1;
            int i5 = this.I1;
            qx3 qx3Var = fx3Var.c;
            boolean z2 = qx3Var.C1;
            bx3 bx3Var2 = qx3Var.o1;
            if (!z2) {
                i4 = 1;
            }
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (bx3Var2.c.length > 1) {
                    size = Math.min(qx3Var.x1.J << 1, size);
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
            hwVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        ah8 ah8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (z3 && !this.B1) {
            ah8Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView.setVisibility(0);
                textView2.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView.setText(k96.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(k96.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final qx3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        go2 go2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        qx3 qx3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    d dVar = qx3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        go2Var = new go2(qx3Var2, iArr, size2, arrayList5);
                                    } else {
                                        go2Var = null;
                                    }
                                    qx3.E0(dVar, tLObject, z4, go2Var, null);
                                    i9++;
                                }
                                qx3Var2.F0(true);
                                if (size2 <= 1) {
                                    qx3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                qx3Var2.dismiss();
                                d dVar2 = qx3Var2.m1;
                                ArrayList arrayList6 = arrayList4;
                                if (dVar2 != null) {
                                    hq6 d02 = hq6.d0(dVar2.getCurrentAccount());
                                    Context context = dVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b00.f(1, arrayList6)) != null) {
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
                                        long s = hq6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        kk7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        nza nzaVar = new nza(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        k21 k21Var = new k21(null, context, z8);
                                        k21Var.b = new bb6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        k21Var.c = new ct2(d02, (boolean[]) r15, arrayList6, context, dVar2, i15);
                                        nzaVar.setButton(k21Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(new vl6(k21Var, (byte) 5), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                        }
                                        m21.g(dVar2, nzaVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = qx3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            hq6.d0(y6c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                qx3Var2.F0(false);
                                return;
                        }
                    }
                });
                K0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView.setVisibility(8);
                textView2.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView2.setText(k96.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(k96.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final qx3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        go2 go2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        qx3 qx3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    d dVar = qx3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        go2Var = new go2(qx3Var2, iArr, size2, arrayList5);
                                    } else {
                                        go2Var = null;
                                    }
                                    qx3.E0(dVar, tLObject, z4, go2Var, null);
                                    i9++;
                                }
                                qx3Var2.F0(true);
                                if (size2 <= 1) {
                                    qx3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                qx3Var2.dismiss();
                                d dVar2 = qx3Var2.m1;
                                ArrayList arrayList6 = arrayList2;
                                if (dVar2 != null) {
                                    hq6 d02 = hq6.d0(dVar2.getCurrentAccount());
                                    Context context = dVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b00.f(1, arrayList6)) != null) {
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
                                        long s = hq6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        kk7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        nza nzaVar = new nza(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        k21 k21Var = new k21(null, context, z8);
                                        k21Var.b = new bb6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        k21Var.c = new ct2(d02, (boolean[]) r15, arrayList6, context, dVar2, i15);
                                        nzaVar.setButton(k21Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(new vl6(k21Var, (byte) 5), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                        }
                                        m21.g(dVar2, nzaVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = qx3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            hq6.d0(y6c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                qx3Var2.F0(false);
                                return;
                        }
                    }
                });
                K0(true);
                return;
            } else {
                textView.setVisibility(8);
                textView2.setVisibility(8);
                K0(false);
                return;
            }
        }
        ah8Var.setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        K0(false);
    }

    public final void J0(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (gl.B(bkb.v0(bkb.g5, this.J0)) > 0.721f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gl.B(bkb.v(bkb.v0(bkb.r8, this.J0), 855638016)) > 0.721f) {
            z3 = true;
        }
        if (!z) {
            z2 = z3;
        }
        gl.m3(this, z2);
    }

    public final void K0(boolean z) {
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
            i = gl.L(19.0f);
        }
        float f5 = i;
        boolean z3 = this.B1;
        hw hwVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z) {
                L2 = f5;
            } else {
                L2 = gl.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f3).setDuration(250L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z) {
                f4 = -(gl.L(68.0f) - f5);
            } else {
                f4 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f4);
            if (!z) {
                f6 = 0.0f;
            }
            translationY2.alpha(f6).setDuration(250L).setInterpolator(s33Var).start();
            ViewPropertyAnimator animate3 = hwVar.animate();
            if (!z3 && !z) {
                f7 = gl.L(68.0f) - f5;
            }
            animate3.translationY(f7).setDuration(250L).setInterpolator(s33Var).start();
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
                L = gl.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z) {
                f6 = 0.0f;
            }
            view.setAlpha(f6);
            if (z) {
                f2 = -(gl.L(68.0f) - f5);
            } else {
                f2 = 0.0f;
            }
            view.setTranslationY(f2);
            if (!z3 && !z) {
                f7 = gl.L(68.0f) - f5;
            }
            hwVar.setTranslationY(f7);
        }
        this.J1 = z;
    }

    @Override
    public final int Q() {
        int measuredHeight;
        int i = 0;
        hw hwVar = this.q1;
        if (hwVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = hwVar.getMeasuredHeight();
        }
        int D0 = measuredHeight - D0();
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            i = viewGroup.getPaddingTop();
        }
        return gl.L(8.0f) + D0 + i + gl.n;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        mx3 mx3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i == kk7.w0) {
            int i3 = 0;
            while (true) {
                hw hwVar = this.q1;
                if (i3 < hwVar.getChildCount()) {
                    View childAt = hwVar.getChildAt(i3);
                    if ((childAt instanceof mx3) && (tL_messages_stickerSet = (mx3Var = (mx3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                        mx3Var.a(hq6.d0(this.a).D0(mx3Var.r.set.id, true), true);
                    }
                    i3++;
                } else {
                    I0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        hx3 hx3Var = this.p1;
        if (hx3Var != null && hx3Var.x) {
            hx3Var.x = false;
            hx3Var.invalidate();
        }
        super.dismiss();
        bx3 bx3Var = this.o1;
        if (bx3Var != null) {
            kk7.f(bx3Var.d).n(bx3Var, kk7.A0);
        }
        kk7.e().k(kk7.j1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.w0);
    }

    @Override
    public final void onBackPressed() {
        if (xv2.e().E) {
            xv2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.w0);
    }

    @Override
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            ih2 ih2Var = this.z1;
            if (ih2Var != null) {
                ih2Var.b(bkb.v0(bkb.Ei, this.J0));
            }
            hx3 hx3Var = this.p1;
            if (hx3Var != null && (bool = hx3Var.c) != null) {
                J0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        ar1 ar1Var;
        super.show();
        fx3 fx3Var = new fx3(this);
        this.r1 = fx3Var;
        this.q1.setAdapter(fx3Var);
        kk7.e().k(kk7.i1, 4);
        bx3 bx3Var = this.o1;
        if (!bx3Var.e) {
            bx3Var.e = true;
            qx3 qx3Var = bx3Var.f;
            int i = bx3Var.d;
            bx3Var.b = new ArrayList(bx3Var.a.size());
            bx3Var.c = new ArrayList[bx3Var.a.size()];
            kk7.f(i).b(bx3Var, 64);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < bx3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = hq6.d0(i).m0((TLRPC.InputStickerSet) bx3Var.a.get(i2), null, false, false, new pz1(bx3Var, zArr, (byte) 15));
                    if (bx3Var.c.length == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        gl.d3(new nx3(bx3Var, (byte) 0));
                        Context context = qx3Var.getContext();
                        d dVar = qx3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) bx3Var.a.get(i2);
                        d dVar2 = qx3Var.m1;
                        if (dVar2 instanceof mu1) {
                            ar1Var = ((mu1) dVar2).a0;
                        } else {
                            ar1Var = null;
                        }
                        new u0b(context, dVar, inputStickerSet, null, ar1Var, qx3Var.J0).show();
                    } else {
                        bx3Var.b.add(m0);
                        bx3Var.a(i2, m0);
                        i2++;
                    }
                } else {
                    qx3 qx3Var2 = bx3Var.h;
                    qx3Var2.I0();
                    hw hwVar = qx3Var2.q1;
                    if (hwVar != null && hwVar.getAdapter() != null) {
                        hwVar.getAdapter().f();
                    }
                }
            }
        }
        I0();
        d dVar3 = this.m1;
        if (dVar3 == null) {
            currentAccount = y6c.t0;
        } else {
            currentAccount = dVar3.getCurrentAccount();
        }
        hq6.d0(currentAccount).D(5);
    }

    public void G0() {
    }

    public void F0(boolean z) {
    }
}
