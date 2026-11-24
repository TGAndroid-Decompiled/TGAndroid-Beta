package defpackage;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ip9 extends c6 {
    public final pp9 a;

    public ip9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        final pp9 pp9Var = this.a;
        qd2 qd2Var = pp9Var.c;
        pp9Var.j();
        if (i == -1) {
            pp9Var.onBackPressed();
        } else if (i == 1) {
            tp9.f(pp9Var.a);
        } else if (i == 9) {
            pp9Var.f();
        } else if (i == 10) {
            AlertDialog$Builder c = pp9Var.c();
            he heVar = c.a;
            if (sd2.W(pp9Var.d)) {
                i5 = 2131743137;
            } else {
                i5 = 2131743004;
            }
            heVar.S = jb6.M0(i5, null);
            TLRPC.Chat chat = pp9Var.d;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            final EditTextBoldCursor d = pp9Var.d(c, str);
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(qd2Var.b.title)) {
                d.setText(qd2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(jb6.M0(2131745680, null), new ee() {
                @Override
                public final void r(he heVar2, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d;
                    pp9 pp9Var2 = pp9Var;
                    switch (b) {
                        case 0:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            pp9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c.g(jb6.M0(2131752542, null), new uu3(d, (byte) 5));
            heVar.setOnShowListener(new he4(d, (byte) 2));
            d.setOnEditorActionListener(new dp9(heVar, (byte) 0));
            pp9.o(heVar);
        } else if (i == 11) {
            AlertDialog$Builder c2 = pp9Var.c();
            he heVar2 = c2.a;
            if (qd2Var.w) {
                boolean z = qd2Var.b.record_video_active;
                heVar2.S = jb6.M0(2131743005, null);
                if (sd2.W(pp9Var.d)) {
                    i4 = 2131743138;
                } else {
                    i4 = 2131743006;
                }
                heVar2.U = jb6.M0(i4, null);
                c2.j(jb6.M0(2131744530, null), new s51((byte) 13, pp9Var, z));
                c2.g(jb6.M0(2131752542, null), null);
                pp9.o(heVar2);
                return;
            }
            heVar2.S = jb6.M0(2131743010, null);
            heVar2.U = jb6.M0(2131743012, null);
            final EditTextBoldCursor d2 = pp9Var.d(c2, jb6.M0(2131743027, null));
            c2.j(jb6.M0(2131744604, null), new ee() {
                @Override
                public final void r(he heVar22, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d2;
                    pp9 pp9Var2 = pp9Var;
                    switch (b) {
                        case 0:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            pp9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c2.g(jb6.M0(2131752542, null), new uu3(d2, (byte) 4));
            heVar2.setOnShowListener(new he4(d2, (byte) 2));
            d2.setOnEditorActionListener(new dp9(heVar2, (byte) 0));
            pp9.o(heVar2);
        } else if (i == 12) {
            AlertDialog$Builder c3 = pp9Var.c();
            he heVar3 = c3.a;
            boolean W = sd2.W(pp9Var.d);
            if (W) {
                i2 = 2131743166;
            } else {
                i2 = 2131743065;
            }
            heVar3.S = jb6.M0(i2, null);
            if (W) {
                i3 = 2131743167;
            } else {
                i3 = 2131743066;
            }
            heVar3.U = jb6.M0(i3, null);
            c3.j(jb6.M0(2131743067, null), new bp9(pp9Var));
            c3.g(jb6.M0(2131752542, null), null);
            pp9.o(heVar3);
            View c4 = heVar3.c(-1);
            if (c4 instanceof TextView) {
                ((TextView) c4).setTextColor(cmb.w0(null, cmb.lh, false));
            }
        }
    }
}
