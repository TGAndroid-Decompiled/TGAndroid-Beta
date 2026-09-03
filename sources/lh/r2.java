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
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.zr;
import org.telegram.ui.lo0;
import org.telegram.ui.qy;
import org.telegram.ui.ro;
public final class r2 implements View.OnClickListener {
    public final int f12988a;
    public final long f12989b;
    public final Object f12990c;
    public final Object d;

    public r2(Object obj, Object obj2, long j10, int i10) {
        this.f12988a = i10;
        this.f12990c = obj;
        this.d = obj2;
        this.f12989b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12988a) {
            case 0:
                g5.Y0((g5) this.f12990c, (String) this.d, this.f12989b);
                return;
            case 1:
                final ro roVar = (ro) this.f12990c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(roVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z4 = !roVar.J.b();
                    if (roVar.J.getCheckBox().C == null) {
                        roVar.J.setChecked(z4);
                    }
                    ChannelBoostsController boostsController = roVar.getMessagesController().getBoostsController();
                    final long j10 = this.f12989b;
                    boostsController.getBoostsStats(j10, new h5.d() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ro roVar2 = ro.this;
                            TLRPC.Chat chat = roVar2.f37926u0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                roVar2.getMessagesController().putChat(roVar2.f37926u0, false);
                            }
                            Switch checkBox = roVar2.J.getCheckBox();
                            if (tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z10 = z4;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z10 && tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                roVar2.J.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = roVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new lh.w1(roVar2, d2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            roVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(roVar2.f37926u0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            roVar2.J.setChecked(z10);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            roVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.zd(4, roVar2, z10), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.d2[]) this.f12990c)[0].dismiss();
                ((zr) this.d).run(-this.f12989b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.d2[]) this.f12990c)[0].dismiss();
                ((zr) this.d).run(-this.f12989b);
                return;
            case 4:
                d70.N((d70) this.f12990c, (Context) this.d, this.f12989b);
                return;
            case 5:
                qy qyVar = (qy) this.f12990c;
                boolean hasUnread = ((org.telegram.ui.Cells.q2) this.d).getHasUnread();
                long j11 = this.f12989b;
                if (hasUnread) {
                    qyVar.j4(j11);
                } else {
                    qyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                qyVar.finishPreviewFragment();
                return;
            default:
                lo0 lo0Var = (lo0) this.f12990c;
                lo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l10 = lo0Var.E0;
                if (l10 != null && longValue == l10.longValue()) {
                    lo0Var.f35831j0 = true;
                    lo0Var.f35826f[0].setText("");
                    lo0Var.f35831j0 = false;
                    lo0Var.E0 = 0L;
                    lo0Var.L0();
                } else {
                    lo0Var.f35826f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f12989b, false, true, true, lo0Var.f35852z0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = lo0Var.f35826f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
