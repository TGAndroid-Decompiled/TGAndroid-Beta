package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
public final class af4 extends ny0 {
    public int S1;
    public final ac7 T1;
    public final ArrayList U1;
    public final FrameLayout V1;
    public ze4 W1;
    public final TextView X1;
    public final ArrayList Y1;
    public final ArrayList Z1;

    public af4(e eVar, ac7 ac7Var, ArrayList arrayList) {
        super(eVar, false);
        ArrayList arrayList2 = new ArrayList();
        this.U1 = arrayList2;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.T1 = ac7Var;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        d1(false);
        this.o1.setTitle(a1(null));
        K(aob.w0(null, aob.h5, false));
        this.S1 = this.H0;
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, aob.Ji, null);
        textView.setTypeface(hl.o());
        textView.setBackground(rnb.f(aob.Fi, 8.0f));
        textView.setText(ob6.M0(2131750606, null));
        textView.setGravity(17);
        textView.setOnClickListener(new mh3(this, (byte) 11));
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V1 = frameLayout;
        this.b.addView(frameLayout, tre.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        c1();
    }

    public static void b1(e eVar, ac7 ac7Var, lw3 lw3Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ac7Var.a;
        eVar.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ft0(eVar, ac7Var, lw3Var, currentTimeMillis, (byte) 1));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        ze4 ze4Var = new ze4(this);
        this.W1 = ze4Var;
        return ze4Var;
    }

    @Override
    public final CharSequence K0() {
        return a1(null);
    }

    @Override
    public final void Q0(wma wmaVar) {
        d79 d79Var = this.n1;
        d79Var.setOverScrollMode(2);
        d79Var.setOnItemClickListener(new u(this, (byte) 28));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        d79Var.setItemAnimator(zb3Var);
    }

    public final void Z0() {
        ac7 ac7Var;
        e eVar;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ac7Var = this.T1;
            int size = ac7Var.h.size();
            eVar = this.r1;
            if (i >= size) {
                break;
            }
            long longValue = ((Long) ac7Var.h.get(i)).longValue();
            if (longValue < 0 && nf4.i0(eVar.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(eVar.getMessagesController().j1(longValue));
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            eVar.presentFragment(new je4(ac7Var, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ac7Var.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        eVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new ye(this, (byte) 27));
    }

    public final CharSequence a1(tpa tpaVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        ac7 ac7Var = this.T1;
        if (ac7Var != null) {
            if (tpaVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = tpaVar.getPaint().getFontMetricsInt();
            }
            obj = r47.A5(pv3.m(new SpannableStringBuilder(ac7Var.b), fontMetricsInt, false, null, 0), ac7Var.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return ob6.V(null, null, 2131750603, obj);
    }

    public final void c1() {
        int i;
        int i2;
        ArrayList arrayList = this.U1;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        this.X1.setVisibility(i);
        int L = hl.L(6.0f);
        int L2 = hl.L(6.0f);
        if (arrayList.isEmpty()) {
            i2 = hl.L(68.0f);
        } else {
            i2 = 0;
        }
        this.n1.setPadding(L, 0, L2, i2);
    }

    public final void d1(boolean z) {
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? kaVar = new ka(0, false);
        kaVar.d = null;
        arrayList2.add(kaVar);
        ArrayList arrayList3 = this.U1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(ef4.d(null));
            arrayList2.add(new ka(8, false));
            for (int i = 0; i < arrayList3.size(); i++) {
                ?? kaVar2 = new ka(7, false);
                kaVar2.m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i);
                arrayList2.add(kaVar2);
            }
        }
        ze4 ze4Var = this.W1;
        if (ze4Var != null) {
            if (z) {
                ze4Var.E(arrayList, arrayList2);
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
            if (this.H0 == this.S1 && (w0 = aob.w0(null, aob.h5, false)) != this.H0) {
                K(w0);
                this.S1 = this.H0;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
