package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class bm8 extends q59 {
    public final Context c;
    public final PrivacyControlActivity d;

    public bm8(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = u69Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b == privacyControlActivity.d0) {
            i7 = ((d) privacyControlActivity).currentAccount;
            if (!bw2.r(i7).t(3)) {
                return true;
            }
        }
        i = privacyControlActivity.currentPhotoForRestRow;
        if (b != i && b != privacyControlActivity.b0) {
            i2 = privacyControlActivity.photoForRestRow;
            if (b != i2) {
                i3 = privacyControlActivity.readRow;
                if (b != i3) {
                    i4 = privacyControlActivity.showGiftIconRow;
                    if (b != i4 && b != privacyControlActivity.g0 && b != privacyControlActivity.p0 && b != privacyControlActivity.q0 && b != privacyControlActivity.r0 && b != privacyControlActivity.o0 && b != privacyControlActivity.n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.y0()) {
                            i5 = privacyControlActivity.nobodyRow;
                            if (b != i5 && b != privacyControlActivity.Q && b != privacyControlActivity.i0) {
                                i6 = privacyControlActivity.everybodyRow;
                                if (b != i6 && b != privacyControlActivity.V && b != privacyControlActivity.U) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final int E(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (longValue > 0) {
                i++;
            } else {
                TLRPC.Chat L0 = this.d.getMessagesController().L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    i += L0.participants_count;
                }
            }
        }
        return i;
    }

    @Override
    public final int b() {
        return this.d.t0;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i != privacyControlActivity.U && i != privacyControlActivity.V && i != privacyControlActivity.d0 && i != privacyControlActivity.g0) {
            if (i != privacyControlActivity.W && i != privacyControlActivity.R && i != privacyControlActivity.S && i != privacyControlActivity.l0 && i != privacyControlActivity.e0 && i != privacyControlActivity.b0 && i != privacyControlActivity.f0 && i != privacyControlActivity.h0) {
                i2 = privacyControlActivity.setBirthdayRow;
                if (i != i2 && i != privacyControlActivity.m0 && i != privacyControlActivity.s0) {
                    if (i != privacyControlActivity.P && i != privacyControlActivity.j0 && i != privacyControlActivity.T && i != privacyControlActivity.c0 && i != privacyControlActivity.X) {
                        i3 = privacyControlActivity.giftTypesHeaderRow;
                        if (i != i3) {
                            i4 = privacyControlActivity.everybodyRow;
                            if (i != i4 && i != privacyControlActivity.Q) {
                                i5 = privacyControlActivity.nobodyRow;
                                if (i != i5 && i != privacyControlActivity.i0 && i != privacyControlActivity.Y && i != privacyControlActivity.Z) {
                                    if (i == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i != privacyControlActivity.a0) {
                                        i6 = privacyControlActivity.photoForRestRow;
                                        if (i != i6) {
                                            i7 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i != i7) {
                                                i8 = privacyControlActivity.readRow;
                                                if (i != i8) {
                                                    i9 = privacyControlActivity.showGiftIconRow;
                                                    if (i != i9 && i != privacyControlActivity.p0 && i != privacyControlActivity.q0 && i != privacyControlActivity.r0 && i != privacyControlActivity.n0 && i != privacyControlActivity.o0) {
                                                        i10 = privacyControlActivity.priceRow;
                                                        if (i == i10) {
                                                            return 9;
                                                        }
                                                        if (i == privacyControlActivity.k0) {
                                                            return 10;
                                                        }
                                                        return 0;
                                                    }
                                                    return 8;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 3;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.u69 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm8.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i) {
            case 0:
                vkb vkbVar = new vkb(context);
                vkbVar.setCanDisable(true);
                view = vkbVar;
                break;
            case 1:
                view = new njb(context);
                break;
            case 2:
                view = new jf5(context);
                break;
            case 3:
                view = new w09(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new bba(context, (hg9) null);
                break;
            case 6:
                xib xibVar = new xib(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = xibVar;
                if (privacyControlActivity.z0 == null) {
                    xibVar.o(2131232053, jb6.a0(null, null, 2131745251, new Object[0]), false);
                } else {
                    xibVar.o(2131232053, jb6.a0("UpdatePhotoForRest", null, 2131743504, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(cmb.L0(false));
                privacyControlActivity.w0.g(cmb.u6, cmb.t6);
                privacyControlActivity.v0 = new p09(2131623965, gm.L(50.0f), gm.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-gm.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                view = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new bf0(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new ru2(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    bf0 bf0Var = privacyControlActivity.x0;
                    if (photo != null) {
                        gn5 i4 = gn5.i(photoSize, photo);
                        i3 = ((d) privacyControlActivity).currentAccount;
                        bf0Var.m(i4, "50_50", null, z8c.h(i3).f());
                    } else {
                        gn5 e = gn5.e(photoSize.location);
                        i2 = ((d) privacyControlActivity).currentAccount;
                        bf0Var.m(e, "50_50", null, z8c.h(i2).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, qoe.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(jb6.M0(2131746022, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(cmb.L0(false));
                ru2 ru2Var = privacyControlActivity.y0;
                int i5 = cmb.o7;
                ru2Var.g(i5, i5);
                view = privacyControlActivity.y0;
                break;
            case 8:
                ylbVar = ((d) privacyControlActivity).resourceProvider;
                view = new bjb(context, ylbVar);
                break;
            case 9:
                ylbVar2 = ((d) privacyControlActivity).resourceProvider;
                view = new jla(context, ylbVar2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                ylbVar3 = ((d) privacyControlActivity).resourceProvider;
                b61 b61Var = new b61(ylbVar3, context, true);
                b61Var.setRoundRadius(24);
                pn2 pn2Var = new pn2(2131232249, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131746487, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                b61Var.i(spannableStringBuilder, false, true);
                b61Var.setOnClickListener(new wk8(this, (byte) 1));
                frameLayout.addView(b61Var, qoe.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new u69(view);
    }
}
