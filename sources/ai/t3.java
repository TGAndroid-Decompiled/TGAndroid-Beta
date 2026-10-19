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
import org.telegram.ui.cy;
import org.telegram.ui.eo0;
import org.telegram.ui.io;
public final class t3 implements View.OnClickListener {
    public final int f2185a;
    public final long f2186b;
    public final Object f2187c;
    public final Object d;

    public t3(Object obj, Object obj2, long j10, int i10) {
        this.f2185a = i10;
        this.f2187c = obj;
        this.d = obj2;
        this.f2186b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2185a) {
            case 0:
                l7.d1((l7) this.f2187c, (String) this.d, this.f2186b);
                return;
            case 1:
                final io ioVar = (io) this.f2187c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ioVar.getParentActivity(), 3, null);
                    b2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ioVar.M.b();
                    if (ioVar.M.getCheckBox().F == null) {
                        ioVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = ioVar.getMessagesController().getBoostsController();
                    final long j10 = this.f2186b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            io ioVar2 = io.this;
                            TLRPC.Chat chat = ioVar2.f38057x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                ioVar2.getMessagesController().putChat(ioVar2.f38057x0, false);
                            }
                            Switch checkBox = ioVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < ioVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < ioVar2.getMessagesController().channelAutotranslationLevelMin) {
                                ioVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = ioVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.x2(ioVar2, b2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ioVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(ioVar2.f38057x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ioVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            ioVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ei.o3(5, ioVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f2187c)[0].dismiss();
                ((ls) this.d).run(-this.f2186b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.b2[]) this.f2187c)[0].dismiss();
                ((ls) this.d).run(-this.f2186b);
                return;
            case 4:
                v70.O((v70) this.f2187c, (Context) this.d, this.f2186b);
                return;
            case 5:
                cy cyVar = (cy) this.f2187c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.f2186b;
                if (hasUnread) {
                    cyVar.h4(j11);
                } else {
                    cyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                cyVar.finishPreviewFragment();
                return;
            default:
                eo0 eo0Var = (eo0) this.f2187c;
                eo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = eo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    eo0Var.m0 = true;
                    eo0Var.f36705f[0].setText("");
                    eo0Var.m0 = false;
                    eo0Var.H0 = 0L;
                    eo0Var.L0();
                } else {
                    eo0Var.f36705f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f2186b, false, true, true, eo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = eo0Var.f36705f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
