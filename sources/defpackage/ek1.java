package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ek1 extends LinearLayout {
    public static final int y = 0;
    public final int a;
    public final ak1 b;
    public final dk1 c;
    public final yd d;
    public final long e;
    public final mj1 f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final ik1 x;

    public ek1(ik1 ik1Var, Activity activity, int i, long j, int i2, mj1 mj1Var, ylb ylbVar) {
        super(activity);
        this.x = ik1Var;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i;
        this.e = j;
        this.f = mj1Var;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        ak1 ak1Var = new ak1(this, activity, ylbVar, ik1Var);
        this.b = ak1Var;
        dk1 dk1Var = new dk1(this, activity, i, j, i2, ylbVar);
        this.c = dk1Var;
        ak1Var.setAdapter(dk1Var);
        vgc l = ak1Var.l(-2, true);
        sy4 sy4Var = ik1Var.d1;
        if (sy4Var != null) {
            sy4Var.c(ak1Var);
        }
        yd ydVar = new yd((byte) 8, activity, this);
        this.d = ydVar;
        ydVar.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        ydVar.addView(l, qoe.e(-1, 48, 48));
        addView(ak1Var, qoe.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.n.isEmpty() && this.r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i) {
        boolean isEmpty;
        if (i == 1) {
            isEmpty = this.n.isEmpty();
        } else if (i == 0) {
            isEmpty = this.r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i) {
        boolean[] zArr = this.w;
        if (!zArr[i]) {
            final boolean a = a();
            final boolean b = b(i);
            int i2 = 20;
            long j = this.e;
            ik1 ik1Var = this.x;
            int i3 = this.a;
            if (i == 1) {
                if (this.h != null && ik1Var.b1) {
                    zArr[i] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = oc7.r1(i3).i1(j);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.n.isEmpty()) {
                        i2 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i2;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ek1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ek1 ek1Var = this.b;
                                    final int i4 = i;
                                    final boolean z = a;
                                    final boolean z2 = b;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            mj1 mj1Var;
                                            mj1 mj1Var2;
                                            byte b2 = r7;
                                            boolean z3 = z2;
                                            boolean z4 = z;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            int i5 = i4;
                                            TLObject tLObject2 = tLObject;
                                            ek1 ek1Var2 = ek1Var;
                                            switch (b2) {
                                                case 0:
                                                    int i6 = ek1Var2.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        oc7.r1(i6).d4(starsStatus.users, false);
                                                        oc7.r1(i6).X3(starsStatus.chats, false);
                                                        ek1Var2.r.addAll(starsStatus.history);
                                                        ek1Var2.s = starsStatus.next_offset;
                                                        ek1Var2.w[i5] = false;
                                                        ek1Var2.d();
                                                    } else if (tL_error2 != null) {
                                                        c41.e0(tL_error2);
                                                    }
                                                    if (ek1Var2.a() != z4 && (mj1Var = ek1Var2.f) != null) {
                                                        mj1Var.run();
                                                    }
                                                    if (ek1Var2.b(i5) != z3) {
                                                        ek1Var2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    int i7 = ek1Var2.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                        oc7.r1(i7).d4(starsStatus2.users, false);
                                                        oc7.r1(i7).X3(starsStatus2.chats, false);
                                                        ek1Var2.n.addAll(starsStatus2.history);
                                                        ek1Var2.h = starsStatus2.next_offset;
                                                        ek1Var2.w[i5] = false;
                                                        ek1Var2.d();
                                                    } else if (tL_error2 != null) {
                                                        c41.e0(tL_error2);
                                                    }
                                                    if (ek1Var2.a() != z4 && (mj1Var2 = ek1Var2.f) != null) {
                                                        mj1Var2.run();
                                                    }
                                                    if (ek1Var2.b(i5) != z3) {
                                                        ek1Var2.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ek1 ek1Var2 = this.b;
                                    final int i5 = i;
                                    final boolean z3 = a;
                                    final boolean z4 = b;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            mj1 mj1Var;
                                            mj1 mj1Var2;
                                            byte b2 = r7;
                                            boolean z32 = z4;
                                            boolean z42 = z3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            int i52 = i5;
                                            TLObject tLObject2 = tLObject;
                                            ek1 ek1Var22 = ek1Var2;
                                            switch (b2) {
                                                case 0:
                                                    int i6 = ek1Var22.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        oc7.r1(i6).d4(starsStatus.users, false);
                                                        oc7.r1(i6).X3(starsStatus.chats, false);
                                                        ek1Var22.r.addAll(starsStatus.history);
                                                        ek1Var22.s = starsStatus.next_offset;
                                                        ek1Var22.w[i52] = false;
                                                        ek1Var22.d();
                                                    } else if (tL_error2 != null) {
                                                        c41.e0(tL_error2);
                                                    }
                                                    if (ek1Var22.a() != z42 && (mj1Var = ek1Var22.f) != null) {
                                                        mj1Var.run();
                                                    }
                                                    if (ek1Var22.b(i52) != z32) {
                                                        ek1Var22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    int i7 = ek1Var22.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                        oc7.r1(i7).d4(starsStatus2.users, false);
                                                        oc7.r1(i7).X3(starsStatus2.chats, false);
                                                        ek1Var22.n.addAll(starsStatus2.history);
                                                        ek1Var22.h = starsStatus2.next_offset;
                                                        ek1Var22.w[i52] = false;
                                                        ek1Var22.d();
                                                    } else if (tL_error2 != null) {
                                                        c41.e0(tL_error2);
                                                    }
                                                    if (ek1Var22.a() != z42 && (mj1Var2 = ek1Var22.f) != null) {
                                                        mj1Var2.run();
                                                    }
                                                    if (ek1Var22.b(i52) != z32) {
                                                        ek1Var22.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                }
            } else if (i == 0 && this.s != null && ik1Var.c1) {
                zArr[i] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = oc7.r1(i3).i1(j);
                tL_payments_getStarsTransactions2.offset = this.s;
                if (this.r.isEmpty()) {
                    i2 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i2;
                ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ek1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ek1 ek1Var = this.b;
                                final int i4 = i;
                                final boolean z = a;
                                final boolean z2 = b;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        mj1 mj1Var;
                                        mj1 mj1Var2;
                                        byte b2 = r7;
                                        boolean z32 = z2;
                                        boolean z42 = z;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        int i52 = i4;
                                        TLObject tLObject2 = tLObject;
                                        ek1 ek1Var22 = ek1Var;
                                        switch (b2) {
                                            case 0:
                                                int i6 = ek1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    oc7.r1(i6).d4(starsStatus.users, false);
                                                    oc7.r1(i6).X3(starsStatus.chats, false);
                                                    ek1Var22.r.addAll(starsStatus.history);
                                                    ek1Var22.s = starsStatus.next_offset;
                                                    ek1Var22.w[i52] = false;
                                                    ek1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    c41.e0(tL_error2);
                                                }
                                                if (ek1Var22.a() != z42 && (mj1Var = ek1Var22.f) != null) {
                                                    mj1Var.run();
                                                }
                                                if (ek1Var22.b(i52) != z32) {
                                                    ek1Var22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i7 = ek1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                    oc7.r1(i7).d4(starsStatus2.users, false);
                                                    oc7.r1(i7).X3(starsStatus2.chats, false);
                                                    ek1Var22.n.addAll(starsStatus2.history);
                                                    ek1Var22.h = starsStatus2.next_offset;
                                                    ek1Var22.w[i52] = false;
                                                    ek1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    c41.e0(tL_error2);
                                                }
                                                if (ek1Var22.a() != z42 && (mj1Var2 = ek1Var22.f) != null) {
                                                    mj1Var2.run();
                                                }
                                                if (ek1Var22.b(i52) != z32) {
                                                    ek1Var22.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ek1 ek1Var2 = this.b;
                                final int i5 = i;
                                final boolean z3 = a;
                                final boolean z4 = b;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        mj1 mj1Var;
                                        mj1 mj1Var2;
                                        byte b2 = r7;
                                        boolean z32 = z4;
                                        boolean z42 = z3;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        int i52 = i5;
                                        TLObject tLObject2 = tLObject;
                                        ek1 ek1Var22 = ek1Var2;
                                        switch (b2) {
                                            case 0:
                                                int i6 = ek1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    oc7.r1(i6).d4(starsStatus.users, false);
                                                    oc7.r1(i6).X3(starsStatus.chats, false);
                                                    ek1Var22.r.addAll(starsStatus.history);
                                                    ek1Var22.s = starsStatus.next_offset;
                                                    ek1Var22.w[i52] = false;
                                                    ek1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    c41.e0(tL_error2);
                                                }
                                                if (ek1Var22.a() != z42 && (mj1Var = ek1Var22.f) != null) {
                                                    mj1Var.run();
                                                }
                                                if (ek1Var22.b(i52) != z32) {
                                                    ek1Var22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i7 = ek1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                    oc7.r1(i7).d4(starsStatus2.users, false);
                                                    oc7.r1(i7).X3(starsStatus2.chats, false);
                                                    ek1Var22.n.addAll(starsStatus2.history);
                                                    ek1Var22.h = starsStatus2.next_offset;
                                                    ek1Var22.w[i52] = false;
                                                    ek1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    c41.e0(tL_error2);
                                                }
                                                if (ek1Var22.a() != z42 && (mj1Var2 = ek1Var22.f) != null) {
                                                    mj1Var2.run();
                                                }
                                                if (ek1Var22.b(i52) != z32) {
                                                    ek1Var22.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ak1 ak1Var = this.b;
            if (i < ak1Var.getViewPages().length) {
                View view = ak1Var.getViewPages()[i];
                if (view instanceof ck1) {
                    ck1 ck1Var = (ck1) view;
                    q7c q7cVar = ck1Var.a;
                    q7cVar.g3.O(true);
                    if (q7cVar.canScrollVertically(1)) {
                        for (int i2 = 0; i2 < q7cVar.getChildCount(); i2++) {
                            if (!(q7cVar.getChildAt(i2) instanceof tk4)) {
                            }
                        }
                    }
                    ck1Var.e.run();
                    break;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int h;
        dk1 dk1Var = this.c;
        ArrayList arrayList = dk1Var.e;
        ArrayList arrayList2 = dk1Var.e;
        int size = arrayList.size();
        ak1 ak1Var = this.b;
        if (size == 0) {
            h = -1;
        } else {
            h = dk1Var.h(ak1Var.getCurrentPosition());
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            i |= 1 << dk1Var.h(i2);
        }
        dk1Var.i();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int h2 = dk1Var.h(i5);
            i3 |= 1 << h2;
            if (h2 == h) {
                i4 = i5;
            }
        }
        if (i == i3) {
            return;
        }
        ak1Var.onTouchEvent(null);
        ak1Var.setPosition(i4);
        ak1Var.J();
        ak1Var.m(false);
        this.x.s();
    }

    public r59 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (!(currentView instanceof ck1)) {
            return null;
        }
        return ((ck1) currentView).a;
    }
}
