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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
public final class nz1 implements f24 {
    public final ChatActivityEnterView a;

    public nz1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.a.p4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z, int i, int i2, jo6 jo6Var, boolean z2) {
        yz1 yz1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        yz1 yz1Var2 = chatActivityEnterView.G0;
        yv1 yv1Var = chatActivityEnterView.F3;
        nv1 nv1Var = chatActivityEnterView.L3;
        if (nv1Var != null && yv1Var != null && nv1Var.f) {
            yv1Var.uc();
        } else if (c() && i == 0) {
            ik.J(chatActivityEnterView.E3, yv1Var.a(), new kz1(this, view, obj, str, obj2, jo6Var, z2), chatActivityEnterView.L4);
        } else if (chatActivityEnterView.H0 > 0 && !c()) {
            uz1 uz1Var = chatActivityEnterView.P3;
            if (uz1Var != null) {
                if (view != null) {
                    yz1Var = view;
                } else {
                    yz1Var = yz1Var2;
                }
                uz1Var.a1(yz1Var, ((lka) yz1Var2.c).getText(), true);
            }
        } else {
            ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new lw1(this, obj, jo6Var, z, i, i2, z2, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.a.G3;
    }

    @Override
    public final boolean b() {
        yv1 yv1Var = this.a.F3;
        if (yv1Var != null && yv1Var.M4()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        yv1 yv1Var = this.a.F3;
        if (yv1Var != null && yv1Var.X7()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mz1 mz1Var = chatActivityEnterView.Q3;
        if (mz1Var != null && !mz1Var.J) {
            mz1Var.n1.b(stickerSet, inputStickerSet);
            return;
        }
        d dVar = chatActivityEnterView.F3;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        d dVar2 = dVar;
        if (dVar2 != null && chatActivityEnterView.E3 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.id = stickerSet.id;
            }
            x2b x2bVar = new x2b(chatActivityEnterView.E3, dVar2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.L4);
            dVar2.showDialog(x2bVar);
            if (z) {
                x2bVar.H0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            PhotoViewer.r0().T1(null, yv1Var, yv1Var.Ba);
            if (obj instanceof TLRPC.Document) {
                bc4.G(chatActivityEnterView.R);
                file = bc4.I((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(bc4.z(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                jo6 jo6Var = new jo6(0, file.getAbsolutePath(), 0, false, 0, 0);
                jo6Var.a = null;
                jo6Var.b = true;
                arrayList.add(jo6Var);
                PhotoViewer.r0().o1(arrayList, 0, 12, false, new lz1(this, obj, obj2, jo6Var), chatActivityEnterView.F3);
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
    public final void g(d4c d4cVar) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        d dVar = chatActivityEnterView.F3;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        d dVar2 = dVar;
        if (dVar2 != null) {
            chatActivityEnterView.Q3 = new mz1(this, chatActivityEnterView.getContext(), dVar2, d4cVar, chatActivityEnterView.L4);
            uz1 uz1Var = chatActivityEnterView.P3;
            if (uz1Var != null) {
                uz1Var.p(true);
            }
            dVar2.showDialog(chatActivityEnterView.Q3);
        }
    }

    @Override
    public final boolean h() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.G3 == z8c.h(chatActivityEnterView.R).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hs6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.E3, stickerSetCovered, 0, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void j(int i) {
        boolean z;
        int i2 = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.R1(i, true);
        if (i != 0) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.S1(true, true, false, z);
        }
        if (chatActivityEnterView.o4 && chatActivityEnterView.H2 == 2) {
            chatActivityEnterView.N();
        }
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean l() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.b7;
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
        EditText editText = chatActivityEnterView.b7;
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
                chatActivityEnterView.I3 = (byte) 2;
                CharSequence m = gw3.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
                editText.setText(editText.getText().insert(selectionEnd, m));
                int length = selectionEnd + m.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } finally {
            chatActivityEnterView.I3 = (byte) 0;
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null && (activity = chatActivityEnterView.E3) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, activity);
            String M0 = jb6.M0(2131752005, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131752006, null);
            alertDialog$Builder.j(jb6.M0(2131752036, null), new cd1(this, (byte) 14));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            yv1Var.showDialog(heVar);
        }
    }

    @Override
    public final float o() {
        return this.a.x0;
    }

    @Override
    public final void p() {
        d dVar = this.a.F3;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        dVar.showDialog(new kj8(dVar, 11, false));
    }

    @Override
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hs6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.E3, stickerSetCovered, 2, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void r(int i) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.P3.B();
        uz1 uz1Var = chatActivityEnterView.P3;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        uz1Var.E1(z);
        chatActivityEnterView.post(chatActivityEnterView.i4);
    }

    @Override
    public final void s(ArrayList arrayList) {
        yv1 yv1Var = this.a.F3;
        if (yv1Var != null) {
            yv1Var.presentFragment(new StickersActivity(5, arrayList));
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
        yv1 yv1Var = this.a.F3;
        if (yv1Var != null) {
            yv1Var.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        qu3 qu3Var = chatActivityEnterView.b7;
        if (qu3Var == null) {
            qu3Var = chatActivityEnterView.F0;
        }
        gm.c3(new ut0(this, qu3Var, str, document, j, z));
    }

    @Override
    public final void x(View view, TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        yz1 yz1Var = chatActivityEnterView.G0;
        if (!chatActivityEnterView.w7) {
            mz1 mz1Var = chatActivityEnterView.Q3;
            if (mz1Var != null) {
                mz1Var.dismiss();
                chatActivityEnterView.Q3 = null;
            }
            if (chatActivityEnterView.H0 > 0 && !c()) {
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    if (view == null) {
                        view = yz1Var;
                    }
                    uz1Var.a1(view, ((lka) yz1Var.c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.p4) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, true);
                    jz1 jz1Var = chatActivityEnterView.V0;
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
                    jz1Var.q(j, true);
                    chatActivityEnterView.V0.y();
                }
                chatActivityEnterView.S1(false, true, false, true);
            }
            chatActivityEnterView.e(document, str, obj, g47Var, false, z, i, 0);
            if (pg3.B(chatActivityEnterView.G3) && k47.s3(document, false)) {
                oc7.r1(chatActivityEnterView.S.a).y4(obj, document);
            }
        }
    }

    @Override
    public final void y(long j) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            if (gm.O1()) {
                chatActivityEnterView.J0(false);
            }
            kd5 kd5Var = new kd5(j);
            kd5Var.j0(chatActivityEnterView.T2);
            yv1Var.presentFragment(kd5Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.a.H2 != 0) {
            return true;
        }
        return false;
    }
}
