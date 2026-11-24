package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class da9 extends my0 {
    public static final int v1 = 0;
    public final hs1 l1;
    public final Paint m1;
    public int n1;
    public final boolean o1;
    public final boolean p1;
    public final boolean q1;
    public final ArrayList r1;
    public final byte[] s1;
    public final long t1;
    public z99 u1;

    public da9(boolean z, Context context, ylb ylbVar, long j, boolean z2, boolean z3, ArrayList arrayList, byte[] bArr) {
        super(1, ylbVar, context, true);
        Paint paint = new Paint(1);
        this.m1 = paint;
        this.o1 = z;
        this.r1 = arrayList;
        this.p1 = z2;
        this.q1 = z3;
        this.s1 = bArr;
        this.t1 = j;
        int i = cmb.g5;
        paint.setColor(cmb.v0(i, ylbVar));
        L(i);
        this.n1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new cs5(this, context);
        hs1 hs1Var = new hs1((byte) 6, context, this);
        this.l1 = hs1Var;
        int i2 = this.u0;
        hs1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(hs1Var, qoe.e(-1, -1, 119));
        hs1Var.setAdapter(new bo0((byte) 4, context, this));
        if (arrayList == null && bArr == null) {
            if (z) {
                I0(null);
            } else {
                J0(null);
            }
        }
    }

    public static void D0(int i, final Context context, final long j, final boolean z, final boolean z2, final ArrayList arrayList, final c41 c41Var, final ylb ylbVar, byte[] bArr, String str, final qac qacVar) {
        TLRPC.TL_messages_report tL_messages_report;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = oc7.r1(i).i1(j);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report = tL_stories_report;
            } else if (z2) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = oc7.r1(i).i1(j);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = oc7.r1(i).i1(j);
                tL_messages_report2.id.addAll(arrayList);
                tL_messages_report2.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report = tL_messages_report2;
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_report, new kc((byte) 0), new jac() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z3 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    qac qacVar2 = qacVar;
                    if (!z3 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        gm.d3(new s99((byte) 0, qacVar2, zArr2), 200L);
                        return;
                    }
                    da9 da9Var = new da9(false, context, ylbVar, j, z, z2, arrayList, null);
                    if (z3) {
                        da9Var.J0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = da9Var.l1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof ca9) {
                            ((ca9) view).a(0);
                            da9Var.b.post(new ey8(viewPages, tL_reportResultAddComment, (byte) 13));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof ca9) {
                            ((ca9) view2).a(1);
                        }
                    }
                    da9Var.u1 = new in3(zArr2, qacVar2, c41Var, (byte) 26);
                    da9Var.n(new s99((byte) 1, qacVar2, zArr2));
                    da9Var.show();
                }
            });
        }
    }

    public static void E0(int i, Context context, c41 c41Var, long j) {
        D0(i, context, j, false, false, new ArrayList(), c41Var, null, new byte[0], null, null);
    }

    public static void F0(long j, d dVar) {
        int currentAccount = dVar.getCurrentAccount();
        Context context = dVar.getContext();
        if (context == null) {
            return;
        }
        D0(currentAccount, context, j, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void G0(yv1 yv1Var, k47 k47Var) {
        int e1;
        int currentAccount = yv1Var.getCurrentAccount();
        Activity parentActivity = yv1Var.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (k47.c3(k47Var.k)) {
            e1 = k47Var.P0();
        } else {
            e1 = k47Var.e1();
        }
        D0(currentAccount, parentActivity, k47.B0(k47Var.k), false, k47.c3(k47Var.k), new ArrayList(Collections.singleton(Integer.valueOf(e1))), c41.b0(yv1Var), yv1Var.getResourceProvider(), new byte[0], null, null);
    }

    public static void H0(yv1 yv1Var, k47 k47Var, ylb ylbVar) {
        if (yv1Var != null) {
            int currentAccount = yv1Var.getCurrentAccount();
            Activity parentActivity = yv1Var.getParentActivity();
            long a = yv1Var.a();
            if (parentActivity == null) {
                return;
            }
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            byte[] bArr = k47Var.R0;
            tL_messages_reportSponsoredMessage.random_id = bArr;
            tL_messages_reportSponsoredMessage.option = new byte[0];
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new xs0(parentActivity, ylbVar, a, bArr, yv1Var, k47Var, currentAccount));
        }
    }

    @Override
    public final boolean C() {
        View currentView = this.l1.getCurrentView();
        if (!(currentView instanceof ca9)) {
            return true;
        }
        return !((ca9) currentView).f.canScrollVertically(-1);
    }

    public final void I0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ca9) {
            ((ca9) view).a(0);
            this.b.post(new ey8(viewPages, tL_channels_sponsoredMessageReportResultChooseOption, (byte) 12));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ca9) {
            ((ca9) view2).a(1);
        }
    }

    public final void J0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ca9) {
            ((ca9) view).a(0);
            this.b.post(new ey8(viewPages, tL_reportResultChooseOption, (byte) 14));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ca9) {
            ((ca9) view2).a(1);
        }
    }

    public final void K0(CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        if (this.o1) {
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            tL_messages_reportSponsoredMessage.random_id = this.s1;
            tL_messages_reportSponsoredMessage.option = bArr;
            tL_messages_report = tL_messages_reportSponsoredMessage;
        } else {
            boolean z = this.p1;
            String str2 = "";
            long j = this.t1;
            ArrayList arrayList = this.r1;
            if (z) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = oc7.r1(this.a).i1(j);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (this.q1) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = oc7.r1(this.a).i1(j);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = oc7.r1(this.a).i1(j);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_report, new av0((Object) this, (Object) charSequence, (Object) bArr, str, (byte) 16));
    }

    @Override
    public final void onBackPressed() {
        ba9 ba9Var;
        hs1 hs1Var = this.l1;
        if ((hs1Var.getCurrentView() instanceof ca9) && (ba9Var = ((ca9) hs1Var.getCurrentView()).n) != null) {
            gm.t1(ba9Var);
        }
        if (hs1Var.getCurrentPosition() > 0) {
            hs1Var.E(hs1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        int i;
        Paint paint = this.m1;
        super.p0();
        try {
            int v0 = cmb.v0(cmb.g5, this.J0);
            if (paint.getColor() != v0) {
                paint.setColor(v0);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 < 0 && (i = this.H0) == this.n1 && v0 != i) {
                this.H0 = v0;
                this.n1 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public da9(Context context, ylb ylbVar, long j, byte[] bArr) {
        this(true, context, ylbVar, j, false, false, null, bArr);
    }
}
