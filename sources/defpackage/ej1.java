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
public final class ej1 extends LinearLayout {
    public static final int y = 0;
    public final int a;
    public final aj1 b;
    public final dj1 c;
    public final zc d;
    public final long e;
    public final ni1 f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final ij1 x;

    public ej1(ij1 ij1Var, Activity activity, int i, long j, int i2, ni1 ni1Var, vnb vnbVar) {
        super(activity);
        this.x = ij1Var;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i;
        this.e = j;
        this.f = ni1Var;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        aj1 aj1Var = new aj1(this, activity, vnbVar, ij1Var);
        this.b = aj1Var;
        dj1 dj1Var = new dj1(this, activity, i, j, i2, vnbVar);
        this.c = dj1Var;
        aj1Var.setAdapter(dj1Var);
        uic l = aj1Var.l(-2, true);
        vy4 vy4Var = ij1Var.d1;
        if (vy4Var != null) {
            vy4Var.c(aj1Var);
        }
        zc zcVar = new zc((byte) 8, activity, this);
        this.d = zcVar;
        zcVar.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        zcVar.addView(l, tre.e(-1, 48, 48));
        addView(aj1Var, tre.o(-1, -1));
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
            ij1 ij1Var = this.x;
            int i3 = this.a;
            if (i == 1) {
                if (this.h != null && ij1Var.b1) {
                    zArr[i] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = uc7.s1(i3).j1(j);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.n.isEmpty()) {
                        i2 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i2;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ej1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ej1 ej1Var = this.b;
                                    final int i4 = i;
                                    final boolean z = a;
                                    final boolean z2 = b;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ni1 ni1Var;
                                            ni1 ni1Var2;
                                            byte b2 = r7;
                                            boolean z3 = z2;
                                            boolean z4 = z;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            int i5 = i4;
                                            TLObject tLObject2 = tLObject;
                                            ej1 ej1Var2 = ej1Var;
                                            switch (b2) {
                                                case 0:
                                                    int i6 = ej1Var2.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        uc7.s1(i6).j4(starsStatus.users, false);
                                                        uc7.s1(i6).c4(starsStatus.chats, false);
                                                        ej1Var2.r.addAll(starsStatus.history);
                                                        ej1Var2.s = starsStatus.next_offset;
                                                        ej1Var2.w[i5] = false;
                                                        ej1Var2.d();
                                                    } else if (tL_error2 != null) {
                                                        d31.e0(tL_error2);
                                                    }
                                                    if (ej1Var2.a() != z4 && (ni1Var = ej1Var2.f) != null) {
                                                        ni1Var.run();
                                                    }
                                                    if (ej1Var2.b(i5) != z3) {
                                                        ej1Var2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    int i7 = ej1Var2.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                        uc7.s1(i7).j4(starsStatus2.users, false);
                                                        uc7.s1(i7).c4(starsStatus2.chats, false);
                                                        ej1Var2.n.addAll(starsStatus2.history);
                                                        ej1Var2.h = starsStatus2.next_offset;
                                                        ej1Var2.w[i5] = false;
                                                        ej1Var2.d();
                                                    } else if (tL_error2 != null) {
                                                        d31.e0(tL_error2);
                                                    }
                                                    if (ej1Var2.a() != z4 && (ni1Var2 = ej1Var2.f) != null) {
                                                        ni1Var2.run();
                                                    }
                                                    if (ej1Var2.b(i5) != z3) {
                                                        ej1Var2.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ej1 ej1Var2 = this.b;
                                    final int i5 = i;
                                    final boolean z3 = a;
                                    final boolean z4 = b;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ni1 ni1Var;
                                            ni1 ni1Var2;
                                            byte b2 = r7;
                                            boolean z32 = z4;
                                            boolean z42 = z3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            int i52 = i5;
                                            TLObject tLObject2 = tLObject;
                                            ej1 ej1Var22 = ej1Var2;
                                            switch (b2) {
                                                case 0:
                                                    int i6 = ej1Var22.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        uc7.s1(i6).j4(starsStatus.users, false);
                                                        uc7.s1(i6).c4(starsStatus.chats, false);
                                                        ej1Var22.r.addAll(starsStatus.history);
                                                        ej1Var22.s = starsStatus.next_offset;
                                                        ej1Var22.w[i52] = false;
                                                        ej1Var22.d();
                                                    } else if (tL_error2 != null) {
                                                        d31.e0(tL_error2);
                                                    }
                                                    if (ej1Var22.a() != z42 && (ni1Var = ej1Var22.f) != null) {
                                                        ni1Var.run();
                                                    }
                                                    if (ej1Var22.b(i52) != z32) {
                                                        ej1Var22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    int i7 = ej1Var22.a;
                                                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                        uc7.s1(i7).j4(starsStatus2.users, false);
                                                        uc7.s1(i7).c4(starsStatus2.chats, false);
                                                        ej1Var22.n.addAll(starsStatus2.history);
                                                        ej1Var22.h = starsStatus2.next_offset;
                                                        ej1Var22.w[i52] = false;
                                                        ej1Var22.d();
                                                    } else if (tL_error2 != null) {
                                                        d31.e0(tL_error2);
                                                    }
                                                    if (ej1Var22.a() != z42 && (ni1Var2 = ej1Var22.f) != null) {
                                                        ni1Var2.run();
                                                    }
                                                    if (ej1Var22.b(i52) != z32) {
                                                        ej1Var22.e();
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
            } else if (i == 0 && this.s != null && ij1Var.c1) {
                zArr[i] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = uc7.s1(i3).j1(j);
                tL_payments_getStarsTransactions2.offset = this.s;
                if (this.r.isEmpty()) {
                    i2 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i2;
                ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ej1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ej1 ej1Var = this.b;
                                final int i4 = i;
                                final boolean z = a;
                                final boolean z2 = b;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ni1 ni1Var;
                                        ni1 ni1Var2;
                                        byte b2 = r7;
                                        boolean z32 = z2;
                                        boolean z42 = z;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        int i52 = i4;
                                        TLObject tLObject2 = tLObject;
                                        ej1 ej1Var22 = ej1Var;
                                        switch (b2) {
                                            case 0:
                                                int i6 = ej1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    uc7.s1(i6).j4(starsStatus.users, false);
                                                    uc7.s1(i6).c4(starsStatus.chats, false);
                                                    ej1Var22.r.addAll(starsStatus.history);
                                                    ej1Var22.s = starsStatus.next_offset;
                                                    ej1Var22.w[i52] = false;
                                                    ej1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    d31.e0(tL_error2);
                                                }
                                                if (ej1Var22.a() != z42 && (ni1Var = ej1Var22.f) != null) {
                                                    ni1Var.run();
                                                }
                                                if (ej1Var22.b(i52) != z32) {
                                                    ej1Var22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i7 = ej1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                    uc7.s1(i7).j4(starsStatus2.users, false);
                                                    uc7.s1(i7).c4(starsStatus2.chats, false);
                                                    ej1Var22.n.addAll(starsStatus2.history);
                                                    ej1Var22.h = starsStatus2.next_offset;
                                                    ej1Var22.w[i52] = false;
                                                    ej1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    d31.e0(tL_error2);
                                                }
                                                if (ej1Var22.a() != z42 && (ni1Var2 = ej1Var22.f) != null) {
                                                    ni1Var2.run();
                                                }
                                                if (ej1Var22.b(i52) != z32) {
                                                    ej1Var22.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ej1 ej1Var2 = this.b;
                                final int i5 = i;
                                final boolean z3 = a;
                                final boolean z4 = b;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ni1 ni1Var;
                                        ni1 ni1Var2;
                                        byte b2 = r7;
                                        boolean z32 = z4;
                                        boolean z42 = z3;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        int i52 = i5;
                                        TLObject tLObject2 = tLObject;
                                        ej1 ej1Var22 = ej1Var2;
                                        switch (b2) {
                                            case 0:
                                                int i6 = ej1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    uc7.s1(i6).j4(starsStatus.users, false);
                                                    uc7.s1(i6).c4(starsStatus.chats, false);
                                                    ej1Var22.r.addAll(starsStatus.history);
                                                    ej1Var22.s = starsStatus.next_offset;
                                                    ej1Var22.w[i52] = false;
                                                    ej1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    d31.e0(tL_error2);
                                                }
                                                if (ej1Var22.a() != z42 && (ni1Var = ej1Var22.f) != null) {
                                                    ni1Var.run();
                                                }
                                                if (ej1Var22.b(i52) != z32) {
                                                    ej1Var22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i7 = ej1Var22.a;
                                                if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                    uc7.s1(i7).j4(starsStatus2.users, false);
                                                    uc7.s1(i7).c4(starsStatus2.chats, false);
                                                    ej1Var22.n.addAll(starsStatus2.history);
                                                    ej1Var22.h = starsStatus2.next_offset;
                                                    ej1Var22.w[i52] = false;
                                                    ej1Var22.d();
                                                } else if (tL_error2 != null) {
                                                    d31.e0(tL_error2);
                                                }
                                                if (ej1Var22.a() != z42 && (ni1Var2 = ej1Var22.f) != null) {
                                                    ni1Var2.run();
                                                }
                                                if (ej1Var22.b(i52) != z32) {
                                                    ej1Var22.e();
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
            aj1 aj1Var = this.b;
            if (i < aj1Var.getViewPages().length) {
                View view = aj1Var.getViewPages()[i];
                if (view instanceof cj1) {
                    cj1 cj1Var = (cj1) view;
                    q9c q9cVar = cj1Var.a;
                    q9cVar.g3.O(true);
                    if (q9cVar.canScrollVertically(1)) {
                        for (int i2 = 0; i2 < q9cVar.getChildCount(); i2++) {
                            if (!(q9cVar.getChildAt(i2) instanceof tk4)) {
                            }
                        }
                    }
                    cj1Var.e.run();
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
        dj1 dj1Var = this.c;
        ArrayList arrayList = dj1Var.e;
        ArrayList arrayList2 = dj1Var.e;
        int size = arrayList.size();
        aj1 aj1Var = this.b;
        if (size == 0) {
            h = -1;
        } else {
            h = dj1Var.h(aj1Var.getCurrentPosition());
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            i |= 1 << dj1Var.h(i2);
        }
        dj1Var.i();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int h2 = dj1Var.h(i5);
            i3 |= 1 << h2;
            if (h2 == h) {
                i4 = i5;
            }
        }
        if (i == i3) {
            return;
        }
        aj1Var.onTouchEvent(null);
        aj1Var.setPosition(i4);
        aj1Var.K();
        aj1Var.m(false);
        this.x.s();
    }

    public d79 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (!(currentView instanceof cj1)) {
            return null;
        }
        return ((cj1) currentView).a;
    }
}
