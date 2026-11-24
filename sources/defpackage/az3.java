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
public class az3 extends my0 implements jm7 {
    public static Pattern P1;
    public m8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final ln G1;
    public final ly3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final d m1;
    public final o72 n1;
    public final my3 o1;
    public final sy3 p1;
    public final hx q1;
    public qy3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final cj8 w1;
    public final q55 x1;
    public final cw6 y1;
    public final wi2 z1;

    public az3(org.telegram.ui.ActionBar.d r21, android.content.Context r22, defpackage.ylb r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az3.<init>(org.telegram.ui.ActionBar.d, android.content.Context, ylb, java.util.ArrayList):void");
    }

    public static void E0(final d dVar, TLObject tLObject, final boolean z, final rp2 rp2Var, final a14 a14Var) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet = null;
        if (dVar == null) {
            currentAccount = z8c.t0;
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
                Runnable runnable = (Runnable) hs6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (rp2Var != null) {
                        rp2Var.a(Boolean.TRUE);
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
                        final rp2 rp2Var2 = rp2Var;
                        final a14 a14Var2 = a14Var;
                        gm.c3(new Runnable() {
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
                                rp2 rp2Var3 = rp2Var2;
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
                                            u31.g(dVar3, new o1b(context, tLObject3, 1, 2, null, dVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            hs6.d0(i4).C1(dVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (rp2Var3 != null) {
                                            rp2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(dVar3.getFragmentView().getContext(), jb6.M0(2131751042, null), 0).show();
                                        if (rp2Var3 != null) {
                                            rp2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (rp2Var3 != null) {
                                        rp2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                hs6.d0(i4).c1(i3, false, true, false, new sk3(a14Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final int D0() {
        if (this.b == null) {
            return 0;
        }
        hx hxVar = this.q1;
        if (hxVar != null && hxVar.getChildCount() >= 1) {
            View childAt = hxVar.getChildAt(0);
            o72 o72Var = this.n1;
            if (childAt != o72Var) {
                return this.b.getPaddingTop();
            }
            return o72Var.getBottom() + ((int) hxVar.getY());
        }
        return this.b.getPaddingTop();
    }

    public final void H0() {
        d dVar = this.m1;
        if (dVar != null) {
            new kj8(dVar, 11, false).show();
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
        my3 my3Var = this.o1;
        if (my3Var.b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(my3Var.b);
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == null) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        hs6 d0 = hs6.d0(this.a);
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
        if (my3Var.a != null && arrayList.size() == my3Var.a.size()) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 2;
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new et1(this, (byte) 20));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(d53.h);
            this.L1.start();
        }
        this.M1 = z;
        hx hxVar = this.q1;
        if (!z) {
            hxVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                if (K0 < E) {
                    i = 0;
                } else {
                    i = 1;
                }
                cw6 cw6Var = this.y1;
                cw6Var.b = i;
                cw6Var.l(E, (gm.q.y / 2) - gm.L(170.0f), false, false);
            } else {
                hxVar.z0(E);
            }
            this.E1 = this.r1.E(this.I1);
            qy3 qy3Var = this.r1;
            int i5 = this.I1;
            az3 az3Var = qy3Var.c;
            boolean z2 = az3Var.C1;
            my3 my3Var2 = az3Var.o1;
            if (!z2) {
                i4 = 1;
            }
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (my3Var2.c.length > 1) {
                    size = Math.min(az3Var.x1.J << 1, size);
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
            hxVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        cj8 cj8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (z3 && !this.B1) {
            cj8Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView.setVisibility(0);
                textView2.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView.setText(jb6.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(jb6.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final az3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        rp2 rp2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        az3 az3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    d dVar = az3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        rp2Var = new rp2(az3Var2, iArr, size2, arrayList5);
                                    } else {
                                        rp2Var = null;
                                    }
                                    az3.E0(dVar, tLObject, z4, rp2Var, null);
                                    i9++;
                                }
                                az3Var2.F0(true);
                                if (size2 <= 1) {
                                    az3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                az3Var2.dismiss();
                                d dVar2 = az3Var2.m1;
                                ArrayList arrayList6 = arrayList4;
                                if (dVar2 != null) {
                                    hs6 d02 = hs6.d0(dVar2.getCurrentAccount());
                                    Context context = dVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b10.f(1, arrayList6)) != null) {
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
                                        long s = hs6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        nm7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(61, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        o1b o1bVar = new o1b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        s31 s31Var = new s31(null, context, z8);
                                        s31Var.b = new ad6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        s31Var.c = new nu2(d02, (boolean[]) r15, arrayList6, context, dVar2, i15);
                                        o1bVar.setButton(s31Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(new pg6(s31Var, (byte) 12), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                        }
                                        u31.g(dVar2, o1bVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = az3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            hs6.d0(z8c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                az3Var2.F0(false);
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
                    textView2.setText(jb6.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(jb6.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final az3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z4;
                        rp2 rp2Var;
                        boolean z5;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i7;
                        int i8;
                        boolean z6;
                        byte b = r3;
                        az3 az3Var2 = this.b;
                        int i9 = 0;
                        boolean z7 = true;
                        switch (b) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                while (i9 < arrayList5.size()) {
                                    d dVar = az3Var2.m1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i9);
                                    if (size2 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (size2 > 1) {
                                        rp2Var = new rp2(az3Var2, iArr, size2, arrayList5);
                                    } else {
                                        rp2Var = null;
                                    }
                                    az3.E0(dVar, tLObject, z4, rp2Var, null);
                                    i9++;
                                }
                                az3Var2.F0(true);
                                if (size2 <= 1) {
                                    az3Var2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                az3Var2.dismiss();
                                d dVar2 = az3Var2.m1;
                                ArrayList arrayList6 = arrayList2;
                                if (dVar2 != null) {
                                    hs6 d02 = hs6.d0(dVar2.getCurrentAccount());
                                    Context context = dVar2.getContext();
                                    ArrayList[] arrayListArr2 = d02.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b10.f(1, arrayList6)) != null) {
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
                                        long s = hs6.s(arrayList7);
                                        jArr[i15] = s;
                                        d02.M1(i15, i14, s, arrayList7);
                                        nm7 notificationCenter = d02.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z8 ? 1 : 0] = Integer.valueOf(i15);
                                        objArr[i13] = Boolean.TRUE;
                                        notificationCenter.k(61, objArr);
                                        for (int i16 = z8 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                            d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                        }
                                        o1b o1bVar = new o1b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar2.getResourceProvider());
                                        ?? r15 = new boolean[i13];
                                        s31 s31Var = new s31(null, context, z8);
                                        s31Var.b = new ad6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                        s31Var.c = new nu2(d02, (boolean[]) r15, arrayList6, context, dVar2, i15);
                                        o1bVar.setButton(s31Var);
                                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                            d02.U.k(new pg6(s31Var, (byte) 12), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                        }
                                        u31.g(dVar2, o1bVar, 2750).j();
                                    }
                                } else {
                                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                        Context context2 = az3Var2.getContext();
                                        if (i18 == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            hs6.d0(z8c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z5, null, true);
                                        }
                                    }
                                }
                                az3Var2.F0(false);
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
        cj8Var.setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        K0(false);
    }

    public final void J0(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (gm.B(cmb.v0(cmb.g5, this.J0)) > 0.721f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gm.B(cmb.v(cmb.v0(cmb.r8, this.J0), 855638016)) > 0.721f) {
            z3 = true;
        }
        if (!z) {
            z2 = z3;
        }
        gm.l3(this, z2);
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
            i = gm.L(19.0f);
        }
        float f5 = i;
        boolean z3 = this.B1;
        hx hxVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z) {
                L2 = f5;
            } else {
                L2 = gm.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f3).setDuration(250L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z) {
                f4 = -(gm.L(68.0f) - f5);
            } else {
                f4 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f4);
            if (!z) {
                f6 = 0.0f;
            }
            translationY2.alpha(f6).setDuration(250L).setInterpolator(d53Var).start();
            ViewPropertyAnimator animate3 = hxVar.animate();
            if (!z3 && !z) {
                f7 = gm.L(68.0f) - f5;
            }
            animate3.translationY(f7).setDuration(250L).setInterpolator(d53Var).start();
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
                L = gm.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z) {
                f6 = 0.0f;
            }
            view.setAlpha(f6);
            if (z) {
                f2 = -(gm.L(68.0f) - f5);
            } else {
                f2 = 0.0f;
            }
            view.setTranslationY(f2);
            if (!z3 && !z) {
                f7 = gm.L(68.0f) - f5;
            }
            hxVar.setTranslationY(f7);
        }
        this.J1 = z;
    }

    @Override
    public final int P() {
        int measuredHeight;
        int i = 0;
        hx hxVar = this.q1;
        if (hxVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = hxVar.getMeasuredHeight();
        }
        int D0 = measuredHeight - D0();
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            i = viewGroup.getPaddingTop();
        }
        return gm.L(8.0f) + D0 + i + gm.n;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wy3 wy3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i == nm7.x0) {
            int i3 = 0;
            while (true) {
                hx hxVar = this.q1;
                if (i3 < hxVar.getChildCount()) {
                    View childAt = hxVar.getChildAt(i3);
                    if ((childAt instanceof wy3) && (tL_messages_stickerSet = (wy3Var = (wy3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                        wy3Var.a(hs6.d0(this.a).D0(wy3Var.r.set.id, true), true);
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
        sy3 sy3Var = this.p1;
        if (sy3Var != null && sy3Var.x) {
            sy3Var.x = false;
            sy3Var.invalidate();
        }
        super.dismiss();
        my3 my3Var = this.o1;
        if (my3Var != null) {
            nm7.f(my3Var.d).n(my3Var, nm7.B0);
        }
        nm7.e().k(nm7.k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.x0);
    }

    @Override
    public final void onBackPressed() {
        if (hx2.e().E) {
            hx2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.x0);
    }

    @Override
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            wi2 wi2Var = this.z1;
            if (wi2Var != null) {
                wi2Var.b(cmb.v0(cmb.Ei, this.J0));
            }
            sy3 sy3Var = this.p1;
            if (sy3Var != null && (bool = sy3Var.c) != null) {
                J0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        ms1 ms1Var;
        super.show();
        qy3 qy3Var = new qy3(this);
        this.r1 = qy3Var;
        this.q1.setAdapter(qy3Var);
        nm7.e().k(nm7.j1, 4);
        my3 my3Var = this.o1;
        if (!my3Var.e) {
            my3Var.e = true;
            az3 az3Var = my3Var.f;
            int i = my3Var.d;
            my3Var.b = new ArrayList(my3Var.a.size());
            my3Var.c = new ArrayList[my3Var.a.size()];
            nm7.f(i).b(my3Var, 65);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < my3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = hs6.d0(i).m0((TLRPC.InputStickerSet) my3Var.a.get(i2), null, false, false, new qy1(my3Var, zArr, (byte) 16));
                    if (my3Var.c.length == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        gm.c3(new xy3(my3Var, (byte) 0));
                        Context context = az3Var.getContext();
                        d dVar = az3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) my3Var.a.get(i2);
                        d dVar2 = az3Var.m1;
                        if (dVar2 instanceof yv1) {
                            ms1Var = ((yv1) dVar2).a0;
                        } else {
                            ms1Var = null;
                        }
                        new x2b(context, dVar, inputStickerSet, null, ms1Var, az3Var.J0).show();
                    } else {
                        my3Var.b.add(m0);
                        my3Var.a(i2, m0);
                        i2++;
                    }
                } else {
                    az3 az3Var2 = my3Var.h;
                    az3Var2.I0();
                    hx hxVar = az3Var2.q1;
                    if (hxVar != null && hxVar.getAdapter() != null) {
                        hxVar.getAdapter().f();
                    }
                }
            }
        }
        I0();
        d dVar3 = this.m1;
        if (dVar3 == null) {
            currentAccount = z8c.t0;
        } else {
            currentAccount = dVar3.getCurrentAccount();
        }
        hs6.d0(currentAccount).D(5);
    }

    public void F0(boolean z) {
    }

    public void G0() {
    }
}
