package jh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bo0;
import org.telegram.ui.fy;
import org.telegram.ui.ko;
public final class q2 implements View.OnClickListener {
    public final int f12654a;
    public final long f12655b;
    public final Object f12656c;
    public final Object d;

    public q2(Object obj, Object obj2, long j10, int i10) {
        this.f12654a = i10;
        this.f12656c = obj;
        this.d = obj2;
        this.f12655b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12654a) {
            case 0:
                h5.Y0((h5) this.f12656c, (String) this.d, this.f12655b);
                return;
            case 1:
                final ko koVar = (ko) this.f12656c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(koVar.getParentActivity(), 3, null);
                    c2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !koVar.I.b();
                    if (koVar.I.getCheckBox().B == null) {
                        koVar.I.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = koVar.getMessagesController().getBoostsController();
                    final long j10 = this.f12655b;
                    boostsController.getBoostsStats(j10, new f5.d() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.f39964t0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                koVar2.getMessagesController().putChat(koVar2.f39964t0, false);
                            }
                            Switch checkBox = koVar2.I.getCheckBox();
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
                                koVar2.I.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = koVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new jh.w1(koVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.f39964t0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            koVar2.I.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            koVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new nh.l3(5, koVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.c2[]) this.f12656c)[0].dismiss();
                ((wr) this.d).run(-this.f12655b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.c2[]) this.f12656c)[0].dismiss();
                ((wr) this.d).run(-this.f12655b);
                return;
            case 4:
                x60.M((x60) this.f12656c, (Context) this.d, this.f12655b);
                return;
            case 5:
                fy fyVar = (fy) this.f12656c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.f12655b;
                if (hasUnread) {
                    fyVar.j4(j11);
                } else {
                    fyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                fyVar.finishPreviewFragment();
                return;
            default:
                bo0 bo0Var = (bo0) this.f12656c;
                bo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l10 = bo0Var.D0;
                if (l10 != null && longValue == l10.longValue()) {
                    bo0Var.f36853i0 = true;
                    bo0Var.f36849f[0].setText("");
                    bo0Var.f36853i0 = false;
                    bo0Var.D0 = 0L;
                    bo0Var.L0();
                } else {
                    bo0Var.f36849f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f12655b, false, true, true, bo0Var.f36874y0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = bo0Var.f36849f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
