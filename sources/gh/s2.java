package gh;

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
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.sr;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.ho;
public final class s2 implements View.OnClickListener {
    public final int f8857a;
    public final long f8858b;
    public final Object f8859c;
    public final Object d;

    public s2(Object obj, Object obj2, long j10, int i9) {
        this.f8857a = i9;
        this.f8859c = obj;
        this.d = obj2;
        this.f8858b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8857a) {
            case 0:
                k5.Y0((k5) this.f8859c, (String) this.d, this.f8858b);
                return;
            case 1:
                final ho hoVar = (ho) this.f8859c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(hoVar.getParentActivity(), 3, null);
                    c2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !hoVar.I.b();
                    if (hoVar.I.getCheckBox().B == null) {
                        hoVar.I.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = hoVar.getMessagesController().getBoostsController();
                    final long j10 = this.f8858b;
                    boostsController.getBoostsStats(j10, new d5.d() {
                        @Override
                        public final void accept(Object obj) {
                            int i9;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ho hoVar2 = ho.this;
                            TLRPC.Chat chat = hoVar2.f38861t0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                hoVar2.getMessagesController().putChat(hoVar2.f38861t0, false);
                            }
                            Switch checkBox = hoVar2.I.getCheckBox();
                            if (tL_premium_boostsStatus.level < hoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i9 = R.drawable.permission_locked;
                            } else {
                                i9 = 0;
                            }
                            checkBox.setIcon(i9);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < hoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                hoVar2.I.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = hoVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new gh.y1(hoVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            hoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(hoVar2.f38861t0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            hoVar2.I.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            hoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new kh.o3(5, hoVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.c2[]) this.f8859c)[0].dismiss();
                ((sr) this.d).run(-this.f8858b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.c2[]) this.f8859c)[0].dismiss();
                ((sr) this.d).run(-this.f8858b);
                return;
            case 4:
                k60.M((k60) this.f8859c, (Context) this.d, this.f8858b);
                return;
            case 5:
                dy dyVar = (dy) this.f8859c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.f8858b;
                if (hasUnread) {
                    dyVar.j4(j11);
                } else {
                    dyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                dyVar.finishPreviewFragment();
                return;
            default:
                co0 co0Var = (co0) this.f8859c;
                co0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l10 = co0Var.D0;
                if (l10 != null && longValue == l10.longValue()) {
                    co0Var.f37260i0 = true;
                    co0Var.f37256f[0].setText("");
                    co0Var.f37260i0 = false;
                    co0Var.D0 = 0L;
                    co0Var.L0();
                } else {
                    co0Var.f37256f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f8858b, false, true, true, co0Var.f37281y0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = co0Var.f37256f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
