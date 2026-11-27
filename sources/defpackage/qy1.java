package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
public final class qy1 implements p14 {
    public final ChatActivityEnterView a;

    public qy1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.a.o4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z, int i, int i2, no6 no6Var, boolean z2) {
        cz1 cz1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        cz1 cz1Var2 = chatActivityEnterView.G0;
        zu1 zu1Var = chatActivityEnterView.E3;
        ou1 ou1Var = chatActivityEnterView.K3;
        if (ou1Var != null && zu1Var != null && ou1Var.f) {
            zu1Var.uc();
        } else if (c() && i == 0) {
            jj.J(chatActivityEnterView.D3, zu1Var.a(), new ny1(this, view, obj, str, obj2, no6Var, z2), chatActivityEnterView.K4);
        } else if (chatActivityEnterView.H0 > 0 && !c()) {
            xy1 xy1Var = chatActivityEnterView.O3;
            if (xy1Var != null) {
                if (view != null) {
                    cz1Var = view;
                } else {
                    cz1Var = cz1Var2;
                }
                xy1Var.b1(cz1Var, ((ema) cz1Var2.c).getText(), true);
            }
        } else {
            jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new nw1(this, obj, no6Var, z, i, i2, z2, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.a.F3;
    }

    @Override
    public final boolean b() {
        zu1 zu1Var = this.a.E3;
        if (zu1Var != null && zu1Var.M4()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        zu1 zu1Var = this.a.E3;
        if (zu1Var != null && zu1Var.X7()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        py1 py1Var = chatActivityEnterView.P3;
        if (py1Var != null && !py1Var.J) {
            py1Var.n1.b(stickerSet, inputStickerSet);
            return;
        }
        e eVar = chatActivityEnterView.E3;
        if (eVar == null) {
            eVar = LaunchActivity.Q();
        }
        e eVar2 = eVar;
        if (eVar2 != null && chatActivityEnterView.D3 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.id = stickerSet.id;
            }
            s4b s4bVar = new s4b(chatActivityEnterView.D3, eVar2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.K4);
            eVar2.showDialog(s4bVar);
            if (z) {
                s4bVar.I0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            PhotoViewer.q0().T1(null, zu1Var, zu1Var.Ba);
            if (obj instanceof TLRPC.Document) {
                xb4.G(chatActivityEnterView.R);
                file = xb4.I((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(xb4.z(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                no6 no6Var = new no6(0, file.getAbsolutePath(), 0, false, 0, 0);
                no6Var.a = null;
                no6Var.b = true;
                arrayList.add(no6Var);
                PhotoViewer.q0().o1(arrayList, 0, 12, false, new oy1(this, obj, obj2, no6Var), chatActivityEnterView.E3);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final void g(d6c d6cVar) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        e eVar = chatActivityEnterView.E3;
        if (eVar == null) {
            eVar = LaunchActivity.Q();
        }
        e eVar2 = eVar;
        if (eVar2 != null) {
            chatActivityEnterView.P3 = new py1(this, chatActivityEnterView.getContext(), eVar2, d6cVar, chatActivityEnterView.K4);
            xy1 xy1Var = chatActivityEnterView.O3;
            if (xy1Var != null) {
                xy1Var.p(true);
            }
            eVar2.showDialog(chatActivityEnterView.P3);
        }
    }

    @Override
    public final boolean h() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.F3 == yac.h(chatActivityEnterView.R).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ls6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.D3, stickerSetCovered, 0, chatActivityEnterView.E3, false, false);
    }

    @Override
    public final void j(int i) {
        boolean z;
        int i2 = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Z1(i, true);
        if (i != 0) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.a2(true, true, false, z);
        }
        if (chatActivityEnterView.n4 && chatActivityEnterView.G2 == 2) {
            chatActivityEnterView.Q();
        }
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean l() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.w7;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.w7;
        if (editText == null) {
            editText = chatActivityEnterView.F0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            try {
                chatActivityEnterView.H3 = (byte) 2;
                CharSequence m = pv3.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
                editText.setText(editText.getText().insert(selectionEnd, m));
                int length = selectionEnd + m.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } finally {
            chatActivityEnterView.H3 = (byte) 0;
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null && (activity = chatActivityEnterView.D3) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.K4, activity);
            String M0 = ob6.M0(2131752033, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131752034, null);
            alertDialog$Builder.j(ob6.M0(2131752064, null), new rd1(this, (byte) 13));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            zu1Var.showDialog(idVar);
        }
    }

    @Override
    public final float o() {
        return this.a.x0;
    }

    @Override
    public final void p() {
        e eVar = this.a.E3;
        if (eVar == null) {
            eVar = LaunchActivity.Q();
        }
        eVar.showDialog(new xk8(eVar, 11, false));
    }

    @Override
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ls6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.D3, stickerSetCovered, 2, chatActivityEnterView.E3, false, false);
    }

    @Override
    public final void r(int i) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O3.C();
        xy1 xy1Var = chatActivityEnterView.O3;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        xy1Var.E1(z);
        chatActivityEnterView.post(chatActivityEnterView.h4);
    }

    @Override
    public final void s(ArrayList arrayList) {
        zu1 zu1Var = this.a.E3;
        if (zu1Var != null) {
            zu1Var.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void t() {
        this.a.invalidate();
    }

    @Override
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
        B(view, obj, str, obj2, z, i, i2, null, false);
    }

    @Override
    public final void v() {
        zu1 zu1Var = this.a.E3;
        if (zu1Var != null) {
            zu1Var.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        xt3 xt3Var = chatActivityEnterView.w7;
        if (xt3Var == null) {
            xt3Var = chatActivityEnterView.F0;
        }
        hl.c3(new us0(this, xt3Var, str, document, j, z));
    }

    @Override
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        cz1 cz1Var = chatActivityEnterView.G0;
        if (!chatActivityEnterView.T7) {
            py1 py1Var = chatActivityEnterView.P3;
            if (py1Var != null) {
                py1Var.dismiss();
                chatActivityEnterView.P3 = null;
            }
            if (chatActivityEnterView.H0 > 0 && !c()) {
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    if (view == null) {
                        view = cz1Var;
                    }
                    xy1Var.b1(view, ((ema) cz1Var.c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.o4) {
                if (chatActivityEnterView.G2 != 0) {
                    chatActivityEnterView.Z1(0, true);
                    my1 my1Var = chatActivityEnterView.V0;
                    long j = -1;
                    if (document != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= document.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    j = inputStickerSet.id;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    my1Var.q(j, true);
                    chatActivityEnterView.V0.z();
                }
                chatActivityEnterView.a2(false, true, false, true);
            }
            chatActivityEnterView.e(document, str, obj, n47Var, false, z, i, 0);
            if (wf3.B(chatActivityEnterView.F3) && r47.s3(document, false)) {
                uc7.s1(chatActivityEnterView.S.a).E4(obj, document);
            }
        }
    }

    @Override
    public final void y(long j) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            if (hl.O1()) {
                chatActivityEnterView.N0(false);
            }
            nd5 nd5Var = new nd5(j);
            nd5Var.i0(chatActivityEnterView.S2);
            zu1Var.presentFragment(nd5Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.a.G2 != 0) {
            return true;
        }
        return false;
    }
}
