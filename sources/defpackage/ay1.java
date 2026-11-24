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
public final class ay1 implements u04 {
    public final ChatActivityEnterView a;

    public ay1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.a.p4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z, int i, int i2, jm6 jm6Var, boolean z2) {
        ly1 ly1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ly1 ly1Var2 = chatActivityEnterView.G0;
        mu1 mu1Var = chatActivityEnterView.F3;
        bu1 bu1Var = chatActivityEnterView.L3;
        if (bu1Var != null && mu1Var != null && bu1Var.f) {
            mu1Var.ic();
        } else if (c() && i == 0) {
            ij.J(chatActivityEnterView.E3, mu1Var.a(), new xx1(this, view, obj, str, obj2, jm6Var, z2), chatActivityEnterView.L4);
        } else if (chatActivityEnterView.H0 > 0 && !c()) {
            hy1 hy1Var = chatActivityEnterView.P3;
            if (hy1Var != null) {
                if (view != null) {
                    ly1Var = view;
                } else {
                    ly1Var = ly1Var2;
                }
                hy1Var.O0(ly1Var, ((jia) ly1Var2.c).getText(), true);
            }
        } else {
            ij.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new zv1(this, obj, jm6Var, z, i, i2, z2, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.a.G3;
    }

    @Override
    public final boolean b() {
        mu1 mu1Var = this.a.F3;
        if (mu1Var != null && mu1Var.H4()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        mu1 mu1Var = this.a.F3;
        if (mu1Var != null && mu1Var.P7()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        zx1 zx1Var = chatActivityEnterView.Q3;
        if (zx1Var != null && !zx1Var.J) {
            zx1Var.n1.b(stickerSet, inputStickerSet);
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
            u0b u0bVar = new u0b(chatActivityEnterView.E3, dVar2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.L4);
            dVar2.showDialog(u0bVar);
            if (z) {
                u0bVar.H0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            PhotoViewer.r0().T1(null, mu1Var, mu1Var.Ba);
            if (obj instanceof TLRPC.Document) {
                ba4.G(chatActivityEnterView.R);
                file = ba4.I((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(ba4.z(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                jm6 jm6Var = new jm6(0, file.getAbsolutePath(), 0, false, 0, 0);
                jm6Var.a = null;
                jm6Var.b = true;
                arrayList.add(jm6Var);
                PhotoViewer.r0().o1(arrayList, 0, 12, false, new yx1(this, obj, obj2, jm6Var), chatActivityEnterView.F3);
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
    public final void g(d2c d2cVar) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        d dVar = chatActivityEnterView.F3;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        d dVar2 = dVar;
        if (dVar2 != null) {
            chatActivityEnterView.Q3 = new zx1(this, chatActivityEnterView.getContext(), dVar2, d2cVar, chatActivityEnterView.L4);
            hy1 hy1Var = chatActivityEnterView.P3;
            if (hy1Var != null) {
                hy1Var.m(true);
            }
            dVar2.showDialog(chatActivityEnterView.Q3);
        }
    }

    @Override
    public final boolean h() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.G3 == y6c.h(chatActivityEnterView.R).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hq6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.E3, stickerSetCovered, 0, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void j(int i) {
        boolean z;
        int i2 = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O1(i, true);
        if (i != 0) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.P1(true, true, false, z);
        }
        if (chatActivityEnterView.o4 && chatActivityEnterView.H2 == 2) {
            chatActivityEnterView.O();
        }
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean l() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.T6;
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
        EditText editText = chatActivityEnterView.T6;
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
                CharSequence m = vu3.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
                editText.setText(editText.getText().insert(selectionEnd, m));
                int length = selectionEnd + m.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } finally {
            chatActivityEnterView.I3 = (byte) 0;
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null && (activity = chatActivityEnterView.E3) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, activity);
            String M0 = k96.M0(2131752056, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752057, null);
            alertDialog$Builder.j(k96.M0(2131752087, null), new rh1(this, (byte) 11));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            mu1Var.showDialog(hdVar);
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
        dVar.showDialog(new jh8(dVar, 11, false));
    }

    @Override
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hq6.d0(chatActivityEnterView.R).h2(chatActivityEnterView.E3, stickerSetCovered, 2, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void r(int i) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.P3.y();
        hy1 hy1Var = chatActivityEnterView.P3;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        hy1Var.j1(z);
        chatActivityEnterView.post(chatActivityEnterView.i4);
    }

    @Override
    public final void s(ArrayList arrayList) {
        mu1 mu1Var = this.a.F3;
        if (mu1Var != null) {
            mu1Var.presentFragment(new StickersActivity(5, arrayList));
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
        mu1 mu1Var = this.a.F3;
        if (mu1Var != null) {
            mu1Var.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        gt3 gt3Var = chatActivityEnterView.T6;
        if (gt3Var == null) {
            gt3Var = chatActivityEnterView.F0;
        }
        gl.c3(new ms0(this, gt3Var, str, document, j, z));
    }

    @Override
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ly1 ly1Var = chatActivityEnterView.G0;
        if (!chatActivityEnterView.o7) {
            zx1 zx1Var = chatActivityEnterView.Q3;
            if (zx1Var != null) {
                zx1Var.dismiss();
                chatActivityEnterView.Q3 = null;
            }
            if (chatActivityEnterView.H0 > 0 && !c()) {
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    if (view == null) {
                        view = ly1Var;
                    }
                    hy1Var.O0(view, ((jia) ly1Var.c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.p4) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.O1(0, true);
                    wx1 wx1Var = chatActivityEnterView.V0;
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
                    wx1Var.r(j, true);
                    chatActivityEnterView.V0.z();
                }
                chatActivityEnterView.P1(false, true, false, true);
            }
            chatActivityEnterView.e(document, str, obj, g27Var, false, z, i, 0);
            if (cf3.B(chatActivityEnterView.G3) && k27.s3(document, false)) {
                na7.q1(chatActivityEnterView.S.a).w4(obj, document);
            }
        }
    }

    @Override
    public final void y(long j) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            if (gl.O1()) {
                chatActivityEnterView.J0(false);
            }
            mb5 mb5Var = new mb5(j);
            mb5Var.i0(chatActivityEnterView.T2);
            mu1Var.presentFragment(mb5Var);
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
