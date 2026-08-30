package lh;

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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.c70;
import org.telegram.ui.jo0;
import org.telegram.ui.oy;
import org.telegram.ui.po;
public final class r2 implements View.OnClickListener {
    public final int f13004a;
    public final long f13005b;
    public final Object f13006c;
    public final Object d;

    public r2(Object obj, Object obj2, long j10, int i10) {
        this.f13004a = i10;
        this.f13006c = obj;
        this.d = obj2;
        this.f13005b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13004a) {
            case 0:
                g5.Y0((g5) this.f13006c, (String) this.d, this.f13005b);
                return;
            case 1:
                final po poVar = (po) this.f13006c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(poVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z4 = !poVar.J.b();
                    if (poVar.J.getCheckBox().C == null) {
                        poVar.J.setChecked(z4);
                    }
                    ChannelBoostsController boostsController = poVar.getMessagesController().getBoostsController();
                    final long j10 = this.f13005b;
                    boostsController.getBoostsStats(j10, new h5.d() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            po poVar2 = po.this;
                            TLRPC.Chat chat = poVar2.f37406u0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                poVar2.getMessagesController().putChat(poVar2.f37406u0, false);
                            }
                            Switch checkBox = poVar2.J.getCheckBox();
                            if (tL_premium_boostsStatus.level < poVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z10 = z4;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z10 && tL_premium_boostsStatus.level < poVar2.getMessagesController().channelAutotranslationLevelMin) {
                                poVar2.J.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = poVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new lh.w1(poVar2, d2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            poVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(poVar2.f37406u0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            poVar2.J.setChecked(z10);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            poVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.zd(4, poVar2, z10), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.d2[]) this.f13006c)[0].dismiss();
                ((as) this.d).run(-this.f13005b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.d2[]) this.f13006c)[0].dismiss();
                ((as) this.d).run(-this.f13005b);
                return;
            case 4:
                c70.N((c70) this.f13006c, (Context) this.d, this.f13005b);
                return;
            case 5:
                oy oyVar = (oy) this.f13006c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.f13005b;
                if (hasUnread) {
                    oyVar.j4(j11);
                } else {
                    oyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                oyVar.finishPreviewFragment();
                return;
            default:
                jo0 jo0Var = (jo0) this.f13006c;
                jo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l10 = jo0Var.E0;
                if (l10 != null && longValue == l10.longValue()) {
                    jo0Var.f35404j0 = true;
                    jo0Var.f35399f[0].setText("");
                    jo0Var.f35404j0 = false;
                    jo0Var.E0 = 0L;
                    jo0Var.L0();
                } else {
                    jo0Var.f35399f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f13005b, false, true, true, jo0Var.f35425z0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = jo0Var.f35399f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
