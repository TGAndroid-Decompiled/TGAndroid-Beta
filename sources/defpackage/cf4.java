package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
public final class cf4 extends mz0 {
    public int S1;
    public final ub7 T1;
    public final ArrayList U1;
    public final FrameLayout V1;
    public bf4 W1;
    public final TextView X1;
    public final ArrayList Y1;
    public final ArrayList Z1;

    public cf4(d dVar, ub7 ub7Var, ArrayList arrayList) {
        super(dVar, false);
        ArrayList arrayList2 = new ArrayList();
        this.U1 = arrayList2;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.T1 = ub7Var;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        c1(false);
        this.o1.setTitle(Z0(null));
        K(cmb.w0(null, cmb.g5, false));
        this.S1 = this.H0;
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.Ii, null);
        textView.setTypeface(gm.o());
        textView.setBackground(ulb.f(cmb.Ei, 8.0f));
        textView.setText(jb6.M0(2131750578, null));
        textView.setGravity(17);
        textView.setOnClickListener(new sf3(this, (byte) 12));
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V1 = frameLayout;
        this.b.addView(frameLayout, qoe.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        b1();
    }

    public static void a1(d dVar, ub7 ub7Var, a14 a14Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
        dVar.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new eu0(dVar, ub7Var, a14Var, currentTimeMillis, (byte) 1));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        bf4 bf4Var = new bf4(this);
        this.W1 = bf4Var;
        return bf4Var;
    }

    @Override
    public final CharSequence J0() {
        return Z0(null);
    }

    @Override
    public final void P0(ela elaVar) {
        r59 r59Var = this.n1;
        r59Var.setOverScrollMode(2);
        r59Var.setOnItemClickListener(new u(this, (byte) 29));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        r59Var.setItemAnimator(sc3Var);
    }

    public final void Y0() {
        ub7 ub7Var;
        d dVar;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ub7Var = this.T1;
            int size = ub7Var.h.size();
            dVar = this.r1;
            if (i >= size) {
                break;
            }
            long longValue = ((Long) ub7Var.h.get(i)).longValue();
            if (longValue < 0 && qf4.j0(dVar.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(dVar.getMessagesController().i1(longValue));
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            dVar.presentFragment(new me4(ub7Var, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        dVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new tg(this, (byte) 27));
    }

    public final CharSequence Z0(xna xnaVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        ub7 ub7Var = this.T1;
        if (ub7Var != null) {
            if (xnaVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = xnaVar.getPaint().getFontMetricsInt();
            }
            obj = k47.A5(gw3.m(new SpannableStringBuilder(ub7Var.b), fontMetricsInt, false, null, 0), ub7Var.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return jb6.V(null, null, 2131750575, obj);
    }

    public final void b1() {
        int i;
        int i2;
        ArrayList arrayList = this.U1;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        this.X1.setVisibility(i);
        int L = gm.L(6.0f);
        int L2 = gm.L(6.0f);
        if (arrayList.isEmpty()) {
            i2 = gm.L(68.0f);
        } else {
            i2 = 0;
        }
        this.n1.setPadding(L, 0, L2, i2);
    }

    public final void c1(boolean z) {
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? jaVar = new ja(0, false);
        jaVar.d = null;
        arrayList2.add(jaVar);
        ArrayList arrayList3 = this.U1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(gf4.d(null));
            arrayList2.add(new ja(8, false));
            for (int i = 0; i < arrayList3.size(); i++) {
                ?? jaVar2 = new ja(7, false);
                jaVar2.m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i);
                arrayList2.add(jaVar2);
            }
        }
        bf4 bf4Var = this.W1;
        if (bf4Var != null) {
            if (z) {
                bf4Var.E(arrayList, arrayList2);
            } else {
                this.n1.getAdapter().f();
            }
        }
    }

    @Override
    public final void p0() {
        int w0;
        super.p0();
        try {
            if (this.H0 == this.S1 && (w0 = cmb.w0(null, cmb.g5, false)) != this.H0) {
                K(w0);
                this.S1 = this.H0;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
