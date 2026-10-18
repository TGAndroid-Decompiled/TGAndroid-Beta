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
import org.telegram.ui.go0;
import org.telegram.ui.ko;
public final class c4 implements View.OnClickListener {
    public final int f1063a;
    public final long f1064b;
    public final Object f1065c;
    public final Object d;

    public c4(Object obj, Object obj2, long j10, int i10) {
        this.f1063a = i10;
        this.f1065c = obj;
        this.d = obj2;
        this.f1064b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1063a) {
            case 0:
                k7.l0((k7) this.f1065c, (String) this.d, this.f1064b);
                return;
            case 1:
                final ko koVar = (ko) this.f1065c;
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
                    final long j10 = this.f1064b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.f38622x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                koVar2.getMessagesController().putChat(koVar2.f38622x0, false);
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
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.w2(koVar2, b2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.f38622x0);
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
                ((org.telegram.ui.ActionBar.b2[]) this.f1065c)[0].dismiss();
                ((ls) this.d).run(-this.f1064b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.b2[]) this.f1065c)[0].dismiss();
                ((ls) this.d).run(-this.f1064b);
                return;
            case 4:
                v70.O((v70) this.f1065c, (Context) this.d, this.f1064b);
                return;
            case 5:
                ey eyVar = (ey) this.f1065c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.f1064b;
                if (hasUnread) {
                    eyVar.h4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                return;
            default:
                go0 go0Var = (go0) this.f1065c;
                go0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = go0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    go0Var.m0 = true;
                    go0Var.f37266f[0].setText("");
                    go0Var.m0 = false;
                    go0Var.H0 = 0L;
                    go0Var.L0();
                } else {
                    go0Var.f37266f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f1064b, false, true, true, go0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = go0Var.f37266f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
