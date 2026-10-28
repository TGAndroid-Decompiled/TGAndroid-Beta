package bi;

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
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ey;
import org.telegram.ui.oo;
import org.telegram.ui.ro0;
public final class p3 implements View.OnClickListener {
    public final int f5222a;
    public final long f5223b;
    public final Object f5224c;
    public final Object d;

    public p3(Object obj, Object obj2, long j10, int i10) {
        this.f5222a = i10;
        this.f5224c = obj;
        this.d = obj2;
        this.f5223b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5222a) {
            case 0:
                h7.c1((h7) this.f5224c, (String) this.d, this.f5223b);
                return;
            case 1:
                final oo ooVar = (oo) this.f5224c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ooVar.getParentActivity(), 3, null);
                    e2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ooVar.M.d();
                    if (ooVar.M.getCheckBox().F == null) {
                        ooVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = ooVar.getMessagesController().getBoostsController();
                    final long j10 = this.f5223b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            oo ooVar2 = oo.this;
                            TLRPC.Chat chat = ooVar2.f42158w0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                ooVar2.getMessagesController().putChat(ooVar2.f42158w0, false);
                            }
                            Switch checkBox = ooVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < ooVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (z11 && tL_premium_boostsStatus.level < ooVar2.getMessagesController().channelAutotranslationLevelMin) {
                                ooVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = ooVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new bi.t2(ooVar2, e2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ooVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(ooVar2.f42158w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ooVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            e2Var2.dismiss();
                            ooVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new fi.m3(5, ooVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.e2[]) this.f5224c)[0].dismiss();
                ((ns) this.d).run(-this.f5223b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.e2[]) this.f5224c)[0].dismiss();
                ((ns) this.d).run(-this.f5223b);
                return;
            case 4:
                z70.N((z70) this.f5224c, (Context) this.d, this.f5223b);
                return;
            case 5:
                ey eyVar = (ey) this.f5224c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.f5223b;
                if (hasUnread) {
                    eyVar.r4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                return;
            default:
                ro0 ro0Var = (ro0) this.f5224c;
                ro0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = ro0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    ro0Var.m0 = true;
                    ro0Var.f43110f[0].setText("");
                    ro0Var.m0 = false;
                    ro0Var.H0 = 0L;
                    ro0Var.M0();
                } else {
                    ro0Var.f43110f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f5223b, false, true, true, ro0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = ro0Var.f43110f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
