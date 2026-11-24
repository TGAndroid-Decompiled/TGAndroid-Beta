package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
public final class cd4 extends fy0 {
    public int S1;
    public final t97 T1;
    public final ArrayList U1;
    public final FrameLayout V1;
    public bd4 W1;
    public final TextView X1;
    public final ArrayList Y1;
    public final ArrayList Z1;

    public cd4(d dVar, t97 t97Var, ArrayList arrayList) {
        super(dVar, false);
        ArrayList arrayList2 = new ArrayList();
        this.U1 = arrayList2;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.T1 = t97Var;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        c1(false);
        this.o1.setTitle(Z0(null));
        L(bkb.w0(null, bkb.g5, false));
        this.S1 = this.H0;
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, bkb.Ii, null);
        textView.setTypeface(gl.o());
        textView.setBackground(sjb.f(bkb.Ei, 8.0f));
        textView.setText(k96.M0(2131750629, null));
        textView.setGravity(17);
        textView.setOnClickListener(new yj3(this, (byte) 9));
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V1 = frameLayout;
        this.b.addView(frameLayout, nme.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        b1();
    }

    public static void a1(d dVar, t97 t97Var, s54 s54Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = t97Var.a;
        dVar.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ws0(dVar, t97Var, s54Var, currentTimeMillis, (byte) 1));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        bd4 bd4Var = new bd4(this);
        this.W1 = bd4Var;
        return bd4Var;
    }

    @Override
    public final CharSequence J0() {
        return Z0(null);
    }

    @Override
    public final void P0(cja cjaVar) {
        o39 o39Var = this.n1;
        o39Var.setOverScrollMode(2);
        o39Var.setOnItemClickListener(new u(this, (byte) 28));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        o39Var.setItemAnimator(gb3Var);
    }

    public final void Y0() {
        t97 t97Var;
        d dVar;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            t97Var = this.T1;
            int size = t97Var.h.size();
            dVar = this.r1;
            if (i >= size) {
                break;
            }
            long longValue = ((Long) t97Var.h.get(i)).longValue();
            if (longValue < 0 && pd4.i0(dVar.getMessagesController().K0(Long.valueOf(-longValue)))) {
                arrayList.add(dVar.getMessagesController().h1(longValue));
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            dVar.presentFragment(new mc4(t97Var, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = t97Var.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        dVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new uf(this, (byte) 26));
    }

    public final CharSequence Z0(wla wlaVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        t97 t97Var = this.T1;
        if (t97Var != null) {
            if (wlaVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = wlaVar.getPaint().getFontMetricsInt();
            }
            obj = k27.A5(vu3.m(new SpannableStringBuilder(t97Var.b), fontMetricsInt, false, null, 0), t97Var.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return k96.V(null, null, 2131750626, obj);
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
        int L = gl.L(6.0f);
        int L2 = gl.L(6.0f);
        if (arrayList.isEmpty()) {
            i2 = gl.L(68.0f);
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
            arrayList2.add(gd4.d(null));
            arrayList2.add(new ja(8, false));
            for (int i = 0; i < arrayList3.size(); i++) {
                ?? jaVar2 = new ja(7, false);
                jaVar2.m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i);
                arrayList2.add(jaVar2);
            }
        }
        bd4 bd4Var = this.W1;
        if (bd4Var != null) {
            if (z) {
                bd4Var.E(arrayList, arrayList2);
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
            if (this.H0 == this.S1 && (w0 = bkb.w0(null, bkb.g5, false)) != this.H0) {
                L(w0);
                this.S1 = this.H0;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
