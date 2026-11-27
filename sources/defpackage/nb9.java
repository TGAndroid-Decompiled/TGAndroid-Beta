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
import org.telegram.ui.ActionBar.e;
public final class nb9 extends nx0 {
    public static final int v1 = 0;
    public final ir1 l1;
    public final Paint m1;
    public int n1;
    public final boolean o1;
    public final boolean p1;
    public final boolean q1;
    public final ArrayList r1;
    public final byte[] s1;
    public final long t1;
    public jb9 u1;

    public nb9(boolean z, Context context, vnb vnbVar, long j, boolean z2, boolean z3, ArrayList arrayList, byte[] bArr) {
        super(1, vnbVar, context, true);
        Paint paint = new Paint(1);
        this.m1 = paint;
        this.o1 = z;
        this.r1 = arrayList;
        this.p1 = z2;
        this.q1 = z3;
        this.s1 = bArr;
        this.t1 = j;
        int i = aob.h5;
        paint.setColor(aob.v0(i, vnbVar));
        L(i);
        this.n1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new fs5(this, context);
        ir1 ir1Var = new ir1((byte) 7, context, this);
        this.l1 = ir1Var;
        int i2 = this.u0;
        ir1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(ir1Var, tre.e(-1, -1, 119));
        ir1Var.setAdapter(new bn0((byte) 5, context, this));
        if (arrayList == null && bArr == null) {
            if (z) {
                J0(null);
            } else {
                K0(null);
            }
        }
    }

    public static void E0(int i, final Context context, final long j, final boolean z, final boolean z2, final ArrayList arrayList, final d31 d31Var, final vnb vnbVar, byte[] bArr, String str, final pcc pccVar) {
        TLRPC.TL_messages_report tL_messages_report;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = uc7.s1(i).j1(j);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report = tL_stories_report;
            } else if (z2) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = uc7.s1(i).j1(j);
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
                tL_messages_report2.peer = uc7.s1(i).j1(j);
                tL_messages_report2.id.addAll(arrayList);
                tL_messages_report2.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report = tL_messages_report2;
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_report, new ic((byte) 0), new icc() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z3 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    pcc pccVar2 = pccVar;
                    if (!z3 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        hl.d3(new db9((byte) 1, pccVar2, zArr2), 200L);
                        return;
                    }
                    nb9 nb9Var = new nb9(false, context, vnbVar, j, z, z2, arrayList, null);
                    if (z3) {
                        nb9Var.K0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = nb9Var.l1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof mb9) {
                            ((mb9) view).a(0);
                            nb9Var.b.post(new yz8(viewPages, tL_reportResultAddComment, (byte) 11));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof mb9) {
                            ((mb9) view2).a(1);
                        }
                    }
                    nb9Var.u1 = new pm3(zArr2, pccVar2, d31Var, (byte) 26);
                    nb9Var.n(new db9((byte) 0, pccVar2, zArr2));
                    nb9Var.show();
                }
            });
        }
    }

    public static void F0(int i, Context context, d31 d31Var, long j) {
        E0(i, context, j, false, false, new ArrayList(), d31Var, null, new byte[0], null, null);
    }

    public static void G0(long j, e eVar) {
        int currentAccount = eVar.getCurrentAccount();
        Context context = eVar.getContext();
        if (context == null) {
            return;
        }
        E0(currentAccount, context, j, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void H0(zu1 zu1Var, r47 r47Var) {
        int e1;
        int currentAccount = zu1Var.getCurrentAccount();
        Activity parentActivity = zu1Var.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (r47.c3(r47Var.k)) {
            e1 = r47Var.P0();
        } else {
            e1 = r47Var.e1();
        }
        E0(currentAccount, parentActivity, r47.B0(r47Var.k), false, r47.c3(r47Var.k), new ArrayList(Collections.singleton(Integer.valueOf(e1))), d31.b0(zu1Var), zu1Var.getResourceProvider(), new byte[0], null, null);
    }

    public static void I0(zu1 zu1Var, r47 r47Var, vnb vnbVar) {
        if (zu1Var != null) {
            int currentAccount = zu1Var.getCurrentAccount();
            Activity parentActivity = zu1Var.getParentActivity();
            long a = zu1Var.a();
            if (parentActivity == null) {
                return;
            }
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            byte[] bArr = r47Var.R0;
            tL_messages_reportSponsoredMessage.random_id = bArr;
            tL_messages_reportSponsoredMessage.option = new byte[0];
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new xr0(parentActivity, vnbVar, a, bArr, zu1Var, r47Var, currentAccount));
        }
    }

    @Override
    public final boolean D() {
        View currentView = this.l1.getCurrentView();
        if (!(currentView instanceof mb9)) {
            return true;
        }
        return !((mb9) currentView).f.canScrollVertically(-1);
    }

    public final void J0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof mb9) {
            ((mb9) view).a(0);
            this.b.post(new yz8(viewPages, tL_channels_sponsoredMessageReportResultChooseOption, (byte) 10));
        }
        View view2 = viewPages[1];
        if (view2 instanceof mb9) {
            ((mb9) view2).a(1);
        }
    }

    public final void K0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof mb9) {
            ((mb9) view).a(0);
            this.b.post(new yz8(viewPages, tL_reportResultChooseOption, (byte) 9));
        }
        View view2 = viewPages[1];
        if (view2 instanceof mb9) {
            ((mb9) view2).a(1);
        }
    }

    public final void L0(CharSequence charSequence, byte[] bArr, String str) {
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
                tL_stories_report.peer = uc7.s1(this.a).j1(j);
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
                tL_reportMessage.peer = uc7.s1(this.a).j1(j);
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
                tL_messages_report2.peer = uc7.s1(this.a).j1(j);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_report, new au0((Object) this, (Object) charSequence, (Object) bArr, str, (byte) 16));
    }

    @Override
    public final void onBackPressed() {
        lb9 lb9Var;
        ir1 ir1Var = this.l1;
        if ((ir1Var.getCurrentView() instanceof mb9) && (lb9Var = ((mb9) ir1Var.getCurrentView()).n) != null) {
            hl.t1(lb9Var);
        }
        if (ir1Var.getCurrentPosition() > 0) {
            ir1Var.F(ir1Var.getCurrentPosition() - 1);
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
            int v0 = aob.v0(aob.h5, this.J0);
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
                y0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public nb9(Context context, vnb vnbVar, long j, byte[] bArr) {
        this(true, context, vnbVar, j, false, false, null, bArr);
    }
}
