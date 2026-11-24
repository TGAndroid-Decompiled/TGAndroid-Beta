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
public final class b89 extends fx0 {
    public static final int v1 = 0;
    public final vq1 l1;
    public final Paint m1;
    public int n1;
    public final boolean o1;
    public final boolean p1;
    public final boolean q1;
    public final ArrayList r1;
    public final byte[] s1;
    public final long t1;
    public x79 u1;

    public b89(boolean z, Context context, wjb wjbVar, long j, boolean z2, boolean z3, ArrayList arrayList, byte[] bArr) {
        super(1, wjbVar, context, true);
        Paint paint = new Paint(1);
        this.m1 = paint;
        this.o1 = z;
        this.r1 = arrayList;
        this.p1 = z2;
        this.q1 = z3;
        this.s1 = bArr;
        this.t1 = j;
        int i = bkb.g5;
        paint.setColor(bkb.v0(i, wjbVar));
        M(i);
        this.n1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new eq5(this, context);
        vq1 vq1Var = new vq1((byte) 6, context, this);
        this.l1 = vq1Var;
        int i2 = this.u0;
        vq1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(vq1Var, nme.e(-1, -1, 119));
        vq1Var.setAdapter(new bn0((byte) 4, context, this));
        if (arrayList == null && bArr == null) {
            if (z) {
                H0(null);
            } else {
                I0(null);
            }
        }
    }

    public static void D0(int i, final Context context, final long j, final boolean z, final boolean z2, final ArrayList arrayList, final u21 u21Var, final wjb wjbVar, byte[] bArr, String str, final p8c p8cVar) {
        TLRPC.TL_messages_report tL_messages_report;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = na7.q1(i).h1(j);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report = tL_stories_report;
            } else if (z2) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = na7.q1(i).h1(j);
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
                tL_messages_report2.peer = na7.q1(i).h1(j);
                tL_messages_report2.id.addAll(arrayList);
                tL_messages_report2.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report = tL_messages_report2;
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_report, new hc((byte) 0), new i8c() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z3 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    p8c p8cVar2 = p8cVar;
                    if (!z3 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        gl.e3(new q79((byte) 0, p8cVar2, zArr2), 200L);
                        return;
                    }
                    b89 b89Var = new b89(false, context, wjbVar, j, z, z2, arrayList, null);
                    if (z3) {
                        b89Var.I0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = b89Var.l1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof a89) {
                            ((a89) view).a(0);
                            b89Var.b.post(new lw8(viewPages, tL_reportResultAddComment, (byte) 11));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof a89) {
                            ((a89) view2).a(1);
                        }
                    }
                    b89Var.u1 = new xl3(zArr2, p8cVar2, u21Var, (byte) 26);
                    b89Var.n(new q79((byte) 1, p8cVar2, zArr2));
                    b89Var.show();
                }
            });
        }
    }

    public static void E0(long j, d dVar) {
        int currentAccount = dVar.getCurrentAccount();
        Context context = dVar.getContext();
        if (context == null) {
            return;
        }
        D0(currentAccount, context, j, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void F0(mu1 mu1Var, k27 k27Var) {
        int e1;
        int currentAccount = mu1Var.getCurrentAccount();
        Activity parentActivity = mu1Var.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (k27.c3(k27Var.k)) {
            e1 = k27Var.P0();
        } else {
            e1 = k27Var.e1();
        }
        D0(currentAccount, parentActivity, k27.B0(k27Var.k), false, k27.c3(k27Var.k), new ArrayList(Collections.singleton(Integer.valueOf(e1))), u21.b0(mu1Var), mu1Var.getResourceProvider(), new byte[0], null, null);
    }

    public static void G0(mu1 mu1Var, k27 k27Var, wjb wjbVar) {
        if (mu1Var != null) {
            int currentAccount = mu1Var.getCurrentAccount();
            Activity parentActivity = mu1Var.getParentActivity();
            long a = mu1Var.a();
            if (parentActivity == null) {
                return;
            }
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            byte[] bArr = k27Var.R0;
            tL_messages_reportSponsoredMessage.random_id = bArr;
            tL_messages_reportSponsoredMessage.option = new byte[0];
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new pr0(parentActivity, wjbVar, a, bArr, mu1Var, k27Var, currentAccount));
        }
    }

    @Override
    public final boolean E() {
        View currentView = this.l1.getCurrentView();
        if (!(currentView instanceof a89)) {
            return true;
        }
        return !((a89) currentView).f.canScrollVertically(-1);
    }

    public final void H0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof a89) {
            ((a89) view).a(0);
            this.b.post(new lw8(viewPages, tL_channels_sponsoredMessageReportResultChooseOption, (byte) 10));
        }
        View view2 = viewPages[1];
        if (view2 instanceof a89) {
            ((a89) view2).a(1);
        }
    }

    public final void I0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof a89) {
            ((a89) view).a(0);
            this.b.post(new lw8(viewPages, tL_reportResultChooseOption, (byte) 12));
        }
        View view2 = viewPages[1];
        if (view2 instanceof a89) {
            ((a89) view2).a(1);
        }
    }

    public final void J0(CharSequence charSequence, byte[] bArr, String str) {
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
                tL_stories_report.peer = na7.q1(this.a).h1(j);
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
                tL_reportMessage.peer = na7.q1(this.a).h1(j);
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
                tL_messages_report2.peer = na7.q1(this.a).h1(j);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_report, new rt0((Object) this, (Object) charSequence, (Object) bArr, str, (byte) 16));
    }

    @Override
    public final void onBackPressed() {
        z79 z79Var;
        vq1 vq1Var = this.l1;
        if ((vq1Var.getCurrentView() instanceof a89) && (z79Var = ((a89) vq1Var.getCurrentView()).n) != null) {
            gl.t1(z79Var);
        }
        if (vq1Var.getCurrentPosition() > 0) {
            vq1Var.E(vq1Var.getCurrentPosition() - 1);
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
            int v0 = bkb.v0(bkb.g5, this.J0);
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
            fa4.g(e, true);
        }
    }

    public b89(Context context, wjb wjbVar, long j, byte[] bArr) {
        this(true, context, wjbVar, j, false, false, null, bArr);
    }
}
