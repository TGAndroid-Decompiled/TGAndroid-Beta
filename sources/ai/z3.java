package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.v70;
import org.telegram.ui.ey;
import org.telegram.ui.fo0;
import org.telegram.ui.ko;
public final class z3 implements View.OnClickListener {
    public final int f2518a;
    public final long f2519b;
    public final Object f2520c;
    public final Object d;

    public z3(Object obj, Object obj2, long j10, int i10) {
        this.f2518a = i10;
        this.f2520c = obj;
        this.d = obj2;
        this.f2519b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2518a) {
            case 0:
                k7.s0((k7) this.f2520c, (String) this.d, this.f2519b);
                return;
            case 1:
                final ko koVar = (ko) this.f2520c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(koVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !koVar.M.b();
                    if (koVar.M.getCheckBox().F == null) {
                        koVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = koVar.getMessagesController().getBoostsController();
                    final long j10 = this.f2519b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.f38614x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                koVar2.getMessagesController().putChat(koVar2.f38614x0, false);
                            }
                            Switch checkBox = koVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin) {
                                koVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = koVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.v2(koVar2, b2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.f38614x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            koVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            koVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ei.o3(5, koVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f2520c)[0].dismiss();
                ((ls) this.d).run(-this.f2519b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.b2[]) this.f2520c)[0].dismiss();
                ((ls) this.d).run(-this.f2519b);
                return;
            case 4:
                v70.O((v70) this.f2520c, (Context) this.d, this.f2519b);
                return;
            case 5:
                ey eyVar = (ey) this.f2520c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.f2519b;
                if (hasUnread) {
                    eyVar.h4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                return;
            default:
                fo0 fo0Var = (fo0) this.f2520c;
                fo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = fo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    fo0Var.m0 = true;
                    fo0Var.f36983f[0].setText("");
                    fo0Var.m0 = false;
                    fo0Var.H0 = 0L;
                    fo0Var.L0();
                } else {
                    fo0Var.f36983f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f2519b, false, true, true, fo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = fo0Var.f36983f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
