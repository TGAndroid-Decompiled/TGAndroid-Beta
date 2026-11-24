package defpackage;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hn9 extends c6 {
    public final on9 a;

    public hn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        final on9 on9Var = this.a;
        fc2 fc2Var = on9Var.c;
        on9Var.j();
        if (i == -1) {
            on9Var.onBackPressed();
        } else if (i == 1) {
            sn9.d(on9Var.a);
        } else if (i == 9) {
            on9Var.f();
        } else if (i == 10) {
            AlertDialog$Builder c = on9Var.c();
            hd hdVar = c.a;
            if (hc2.W(on9Var.d)) {
                i5 = 2131743211;
            } else {
                i5 = 2131743078;
            }
            hdVar.S = k96.M0(i5, null);
            TLRPC.Chat chat = on9Var.d;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            final EditTextBoldCursor d = on9Var.d(c, str);
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(fc2Var.b.title)) {
                d.setText(fc2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(k96.M0(2131745754, null), new ed() {
                @Override
                public final void u(hd hdVar2, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d;
                    on9 on9Var2 = on9Var;
                    switch (b) {
                        case 0:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            on9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c.g(k96.M0(2131752577, null), new kt3(d, (byte) 5));
            hdVar.setOnShowListener(new hc4(d, (byte) 2));
            d.setOnEditorActionListener(new cn9(hdVar, (byte) 0));
            on9.o(hdVar);
        } else if (i == 11) {
            AlertDialog$Builder c2 = on9Var.c();
            hd hdVar2 = c2.a;
            if (fc2Var.w) {
                boolean z = fc2Var.b.record_video_active;
                hdVar2.S = k96.M0(2131743079, null);
                if (hc2.W(on9Var.d)) {
                    i4 = 2131743212;
                } else {
                    i4 = 2131743080;
                }
                hdVar2.U = k96.M0(i4, null);
                c2.j(k96.M0(2131744604, null), new l41((byte) 13, on9Var, z));
                c2.g(k96.M0(2131752577, null), null);
                on9.o(hdVar2);
                return;
            }
            hdVar2.S = k96.M0(2131743084, null);
            hdVar2.U = k96.M0(2131743086, null);
            final EditTextBoldCursor d2 = on9Var.d(c2, k96.M0(2131743101, null));
            c2.j(k96.M0(2131744678, null), new ed() {
                @Override
                public final void u(hd hdVar22, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d2;
                    on9 on9Var2 = on9Var;
                    switch (b) {
                        case 0:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            on9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c2.g(k96.M0(2131752577, null), new kt3(d2, (byte) 4));
            hdVar2.setOnShowListener(new hc4(d2, (byte) 2));
            d2.setOnEditorActionListener(new cn9(hdVar2, (byte) 0));
            on9.o(hdVar2);
        } else if (i == 12) {
            AlertDialog$Builder c3 = on9Var.c();
            hd hdVar3 = c3.a;
            boolean W = hc2.W(on9Var.d);
            if (W) {
                i2 = 2131743240;
            } else {
                i2 = 2131743139;
            }
            hdVar3.S = k96.M0(i2, null);
            if (W) {
                i3 = 2131743241;
            } else {
                i3 = 2131743140;
            }
            hdVar3.U = k96.M0(i3, null);
            c3.j(k96.M0(2131743141, null), new an9(on9Var));
            c3.g(k96.M0(2131752577, null), null);
            on9.o(hdVar3);
            View c4 = hdVar3.c(-1);
            if (c4 instanceof TextView) {
                ((TextView) c4).setTextColor(bkb.w0(null, bkb.lh, false));
            }
        }
    }
}
