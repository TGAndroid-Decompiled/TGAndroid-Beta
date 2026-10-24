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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.v70;
import org.telegram.ui.ey;
import org.telegram.ui.ho0;
import org.telegram.ui.ko;
public final class t3 implements View.OnClickListener {
    public final int f2188a;
    public final long f2189b;
    public final Object f2190c;
    public final Object d;

    public t3(Object obj, Object obj2, long j10, int i10) {
        this.f2188a = i10;
        this.f2190c = obj;
        this.d = obj2;
        this.f2189b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2188a) {
            case 0:
                l7.c1((l7) this.f2190c, (String) this.d, this.f2189b);
                return;
            case 1:
                final ko koVar = (ko) this.f2190c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(koVar.getParentActivity(), 3, null);
                    c2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !koVar.M.d();
                    if (koVar.M.getCheckBox().F == null) {
                        koVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = koVar.getMessagesController().getBoostsController();
                    final long j10 = this.f2189b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.f38980w0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                koVar2.getMessagesController().putChat(koVar2.f38980w0, false);
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
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin) {
                                koVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = koVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.x2(koVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.f38980w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            koVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            koVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ei.o3(5, koVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.c2[]) this.f2190c)[0].dismiss();
                ((js) this.d).run(-this.f2189b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.c2[]) this.f2190c)[0].dismiss();
                ((js) this.d).run(-this.f2189b);
                return;
            case 4:
                v70.N((v70) this.f2190c, (Context) this.d, this.f2189b);
                return;
            case 5:
                ey eyVar = (ey) this.f2190c;
                boolean hasUnread = ((org.telegram.ui.Cells.q2) this.d).getHasUnread();
                long j11 = this.f2189b;
                if (hasUnread) {
                    eyVar.h4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                return;
            default:
                ho0 ho0Var = (ho0) this.f2190c;
                ho0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = ho0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    ho0Var.m0 = true;
                    ho0Var.f37927f[0].setText("");
                    ho0Var.m0 = false;
                    ho0Var.H0 = 0L;
                    ho0Var.L0();
                } else {
                    ho0Var.f37927f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f2189b, false, true, true, ho0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = ho0Var.f37927f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
