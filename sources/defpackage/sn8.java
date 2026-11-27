package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.PrivacySettingsActivity;
public final class sn8 extends c79 {
    public final Context c;
    public final PrivacySettingsActivity d;

    public sn8(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int b = f89Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i = privacySettingsActivity.passcodeRow;
        if (b != i) {
            i2 = privacySettingsActivity.passwordRow;
            if (b != i2) {
                i3 = privacySettingsActivity.passkeysRow;
                if (b != i3) {
                    i4 = privacySettingsActivity.blockedRow;
                    if (b != i4 && b != privacySettingsActivity.s) {
                        i5 = privacySettingsActivity.secretWebpageRow;
                        if (b != i5) {
                            i6 = privacySettingsActivity.webSessionsRow;
                            if (b != i6 && (b != privacySettingsActivity.n || privacySettingsActivity.getContactsController().t(1))) {
                                i7 = privacySettingsActivity.lastSeenRow;
                                if (b != i7 || privacySettingsActivity.getContactsController().t(0)) {
                                    i8 = privacySettingsActivity.callsRow;
                                    if (b != i8 || privacySettingsActivity.getContactsController().t(2)) {
                                        i9 = privacySettingsActivity.profilePhotoRow;
                                        if (b != i9 || privacySettingsActivity.getContactsController().t(4)) {
                                            i10 = privacySettingsActivity.bioRow;
                                            if (b != i10 || privacySettingsActivity.getContactsController().t(9)) {
                                                i11 = privacySettingsActivity.musicRow;
                                                if (b != i11 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i12 = privacySettingsActivity.birthdayRow;
                                                    if (b != i12 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i13 = privacySettingsActivity.giftsRow;
                                                        if (b != i13 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i14 = privacySettingsActivity.forwardsRow;
                                                            if (b != i14 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i15 = privacySettingsActivity.phoneNumberRow;
                                                                if (b != i15 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i16 = privacySettingsActivity.voicesRow;
                                                                    if (b != i16 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i17 = privacySettingsActivity.noncontactsRow;
                                                                        if (b != i17) {
                                                                            i18 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b != i18 || privacySettingsActivity.getContactsController().H != 2) {
                                                                                i19 = privacySettingsActivity.newChatsRow;
                                                                                if (b != i19 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                    i20 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b != i20) {
                                                                                        i21 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b != i21) {
                                                                                            i22 = privacySettingsActivity.secretMapRow;
                                                                                            if (b != i22) {
                                                                                                i23 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b != i23 && b != privacySettingsActivity.H) {
                                                                                                    i24 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b != i24) {
                                                                                                        i25 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b != i25) {
                                                                                                            i26 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b != i26 && b != privacySettingsActivity.I) {
                                                                                                                return false;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.P;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i != privacySettingsActivity.H) {
            i2 = privacySettingsActivity.lastSeenRow;
            if (i != i2) {
                i3 = privacySettingsActivity.phoneNumberRow;
                if (i != i3) {
                    i4 = privacySettingsActivity.deleteAccountRow;
                    if (i != i4) {
                        i5 = privacySettingsActivity.webSessionsRow;
                        if (i != i5 && i != privacySettingsActivity.n) {
                            i6 = privacySettingsActivity.paymentsClearRow;
                            if (i != i6) {
                                i7 = privacySettingsActivity.secretMapRow;
                                if (i != i7) {
                                    i8 = privacySettingsActivity.contactsDeleteRow;
                                    if (i != i8 && i != privacySettingsActivity.I) {
                                        if (i != privacySettingsActivity.h && i != privacySettingsActivity.F && i != privacySettingsActivity.r && i != privacySettingsActivity.w && i != privacySettingsActivity.O && i != privacySettingsActivity.J && i != privacySettingsActivity.M && i != privacySettingsActivity.y) {
                                            if (i != 0 && i != privacySettingsActivity.E && i != privacySettingsActivity.f && i != privacySettingsActivity.N && i != privacySettingsActivity.G && i != privacySettingsActivity.L && i != privacySettingsActivity.x) {
                                                i9 = privacySettingsActivity.secretWebpageRow;
                                                if (i != i9) {
                                                    i10 = privacySettingsActivity.contactsSyncRow;
                                                    if (i != i10) {
                                                        i11 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i != i11) {
                                                            i12 = privacySettingsActivity.newChatsRow;
                                                            if (i != i12) {
                                                                if (i != privacySettingsActivity.K) {
                                                                    i13 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i != i13 && i != privacySettingsActivity.s) {
                                                                        i14 = privacySettingsActivity.emailLoginRow;
                                                                        if (i != i14) {
                                                                            i15 = privacySettingsActivity.passwordRow;
                                                                            if (i != i15) {
                                                                                i16 = privacySettingsActivity.passkeysRow;
                                                                                if (i != i16) {
                                                                                    i17 = privacySettingsActivity.passcodeRow;
                                                                                    if (i != i17) {
                                                                                        i18 = privacySettingsActivity.blockedRow;
                                                                                        if (i == i18) {
                                                                                            return 5;
                                                                                        }
                                                                                        return 0;
                                                                                    }
                                                                                    return 5;
                                                                                }
                                                                                return 5;
                                                                            }
                                                                            return 5;
                                                                        }
                                                                        return 5;
                                                                    }
                                                                    return 5;
                                                                }
                                                                return 4;
                                                            }
                                                            return 3;
                                                        }
                                                        return 3;
                                                    }
                                                    return 3;
                                                }
                                                return 3;
                                            }
                                            return 2;
                                        }
                                        return 1;
                                    }
                                    return 0;
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                    return 0;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String M0;
        boolean z2;
        CharSequence z0;
        int i18;
        boolean z3;
        CharSequence A0;
        boolean z4;
        int i19;
        boolean z5;
        boolean z6;
        String A02;
        String A03;
        String A04;
        String A05;
        float f;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z7;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        String M02;
        String str2;
        String str3;
        int i30;
        String str4;
        boolean z8;
        String str5;
        String str6;
        String M03;
        String str7;
        int i31 = f89Var.f;
        byte b = 16;
        String str8 = null;
        boolean z9 = false;
        boolean z10 = true;
        if (i31 != 0) {
            if (i31 != 1) {
                if (i31 != 2) {
                    if (i31 != 3) {
                        if (i31 == 5) {
                            View view = f89Var.a;
                            skb skbVar = (skb) view;
                            if (view.getTag() != null && ((Integer) f89Var.a.getTag()).intValue() == i) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            f89Var.a.setTag(Integer.valueOf(i));
                            skbVar.setPrioritizeTitleOverValue(false);
                            i24 = this.d.autoDeleteMesages;
                            PrivacySettingsActivity privacySettingsActivity = this.d;
                            if (i == i24) {
                                int i32 = privacySettingsActivity.getUserConfig().q0;
                                if (i32 == -1) {
                                    str7 = null;
                                    z9 = true;
                                } else {
                                    if (i32 > 0) {
                                        M03 = ob6.c0(i32 * 60);
                                    } else {
                                        M03 = ob6.M0(2131747166, "PasswordOff");
                                    }
                                    str7 = M03;
                                }
                                skbVar.u(ob6.M0(2131753843, "AutoDeleteMessages"), str7, true, 2131232022, true);
                            } else {
                                String str9 = "";
                                if (i != privacySettingsActivity.s) {
                                    i25 = privacySettingsActivity.emailLoginRow;
                                    PrivacySettingsActivity privacySettingsActivity2 = this.d;
                                    if (i != i25) {
                                        i26 = privacySettingsActivity2.passwordRow;
                                        PrivacySettingsActivity privacySettingsActivity3 = this.d;
                                        if (i != i26) {
                                            i27 = privacySettingsActivity3.passkeysRow;
                                            PrivacySettingsActivity privacySettingsActivity4 = this.d;
                                            if (i != i27) {
                                                i28 = privacySettingsActivity4.passcodeRow;
                                                if (i != i28) {
                                                    i29 = this.d.blockedRow;
                                                    if (i == i29) {
                                                        int i33 = this.d.getMessagesController().y0;
                                                        if (i33 == 0) {
                                                            str = ob6.M0(2131753675, "BlockedEmpty");
                                                        } else if (i33 > 0) {
                                                            str = String.format(ob6.D0().y, "%d", Integer.valueOf(i33));
                                                        } else {
                                                            z9 = true;
                                                            str = str9;
                                                        }
                                                        skbVar.u(ob6.M0(2131753674, "BlockedUsers"), str, true, 2131232024, true);
                                                    }
                                                } else {
                                                    if (xea.r.length() != 0) {
                                                        M02 = ob6.M0(2131747165, null);
                                                    } else {
                                                        M02 = ob6.M0(2131747166, null);
                                                    }
                                                    skbVar.u(ob6.M0(2131747384, null), M02, true, 2131232040, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity4.e;
                                                if (arrayList == null) {
                                                    z9 = true;
                                                    str2 = str9;
                                                } else if (arrayList.size() == 1 && skbVar.c.getPaint().measureText(((TL_account.Passkey) this.d.e.get(0)).name) < hl.q.x / 3.0f) {
                                                    str2 = ((TL_account.Passkey) this.d.e.get(0)).name;
                                                } else if (this.d.e.size() > 0) {
                                                    str2 = this.d.e.size() + "";
                                                } else {
                                                    str2 = ob6.M0(2131747166, null);
                                                }
                                                skbVar.u(ob6.M0(2131747378, null), str2, true, 2131232037, true);
                                            }
                                        } else {
                                            TL_account.Password password = privacySettingsActivity3.d;
                                            int i34 = 2131231765;
                                            if (password == null) {
                                                i30 = 2131231765;
                                                z9 = true;
                                                str4 = str9;
                                            } else {
                                                if (password.has_password) {
                                                    i34 = 2131231766;
                                                    str3 = ob6.M0(2131747165, null);
                                                } else {
                                                    str3 = ob6.M0(2131747166, null);
                                                }
                                                i30 = i34;
                                                str4 = str3;
                                            }
                                            skbVar.u(ob6.M0(2131743593, null), str4, true, i30, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity2.d;
                                        if (password2 == null) {
                                            z8 = true;
                                            str5 = str9;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = this.d.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = this.d.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.a |= 256;
                                                obj.b = indexOf;
                                                int i35 = lastIndexOf + 1;
                                                obj.c = i35;
                                                valueOf.setSpan(new smb(obj, 0), indexOf, i35, 0);
                                            }
                                            z8 = false;
                                            str5 = valueOf;
                                        }
                                        skbVar.setPrioritizeTitleOverValue(true);
                                        String M04 = ob6.M0(2131751167, null);
                                        skbVar.x = skbVar.getDefaultImageLeft();
                                        skbVar.s = skbVar.c(false);
                                        ema emaVar = skbVar.a;
                                        emaVar.l(M04, false);
                                        emaVar.i(null);
                                        ema emaVar2 = skbVar.d;
                                        emaVar2.setVisibility(0);
                                        emaVar2.l(str5, false);
                                        skbVar.c.setVisibility(8);
                                        skbVar.h.setVisibility(8);
                                        e29 e29Var = skbVar.e;
                                        e29Var.setVisibility(0);
                                        e29Var.setTranslationX(0.0f);
                                        e29Var.setTranslationY(0.0f);
                                        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
                                        e29Var.setImageResource(2131232030);
                                        skbVar.r = true;
                                        skbVar.setWillNotDraw(false);
                                        Switch r1 = skbVar.f;
                                        if (r1 != null) {
                                            r1.setVisibility(8);
                                        }
                                        ul ulVar = skbVar.L;
                                        if (ulVar != null) {
                                            ulVar.g(null, false);
                                        }
                                        z9 = z8;
                                    }
                                } else {
                                    if (privacySettingsActivity.b0.h0() == 0) {
                                        if (this.d.getMessagesController().a == 0) {
                                            z9 = true;
                                            str6 = str9;
                                        } else {
                                            str6 = String.format(ob6.D0().y, "%d", Integer.valueOf(this.d.getMessagesController().a));
                                        }
                                    } else {
                                        str6 = String.format(ob6.D0().y, "%d", Integer.valueOf(this.d.b0.h0()));
                                    }
                                    this.d.getMessagesController().a = this.d.b0.h0();
                                    skbVar.u(ob6.M0(2131745279, null), str6, true, 2131232028, false);
                                }
                            }
                            skbVar.h(16, z9, z7);
                            return;
                        }
                        return;
                    }
                    wkb wkbVar = (wkb) f89Var.a;
                    i20 = this.d.secretWebpageRow;
                    if (i != i20) {
                        i21 = this.d.contactsSyncRow;
                        if (i != i21) {
                            i22 = this.d.contactsSuggestRow;
                            if (i != i22) {
                                i23 = this.d.newChatsRow;
                                if (i == i23) {
                                    wkbVar.f(ob6.M0(2131754164, "ArchiveAndMute"), this.d.X, false);
                                    return;
                                }
                                return;
                            }
                            wkbVar.f(ob6.M0(2131744065, "SuggestContacts"), this.d.W, false);
                            return;
                        }
                        wkbVar.f(ob6.M0(2131743951, "SyncContacts"), this.d.U, true);
                        return;
                    }
                    String M05 = ob6.M0(2131745412, "SecretWebPage");
                    if (this.d.getMessagesController().z2 != 1) {
                        z10 = false;
                    }
                    wkbVar.f(M05, z10, false);
                    return;
                }
                mf5 mf5Var = (mf5) f89Var.a;
                PrivacySettingsActivity privacySettingsActivity5 = this.d;
                if (i == privacySettingsActivity5.f) {
                    mf5Var.setText(ob6.M0(2131746498, "PrivacyTitle"));
                    return;
                } else if (i == 0) {
                    mf5Var.setText(ob6.M0(2131745410, "SecurityTitle"));
                    return;
                } else if (i == privacySettingsActivity5.E) {
                    mf5Var.setText(ob6.M0(2131751483, "DeleteMyAccount"));
                    return;
                } else if (i == privacySettingsActivity5.N) {
                    mf5Var.setText(ob6.M0(2131745423, "SecretChat"));
                    return;
                } else if (i == privacySettingsActivity5.G) {
                    mf5Var.setText(ob6.M0(2131746579, "PrivacyBots"));
                    return;
                } else if (i == privacySettingsActivity5.L) {
                    mf5Var.setText(ob6.M0(2131751745, "Contacts"));
                    return;
                } else if (i == privacySettingsActivity5.x) {
                    mf5Var.setText(ob6.M0(2131748039, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            ilb ilbVar = (ilb) f89Var.a;
            PrivacySettingsActivity privacySettingsActivity6 = this.d;
            if (i == privacySettingsActivity6.F) {
                ilbVar.setText(ob6.M0(2131751562, "DeleteAccountHelp"));
                return;
            } else if (i == privacySettingsActivity6.r) {
                ilbVar.setText(ob6.M0(2131749135, "GroupsAndChannelsHelp"));
                return;
            } else if (i == privacySettingsActivity6.w) {
                ilbVar.setText(ob6.M0(2131745280, "SessionsSettingsInfo"));
                return;
            } else if (i == privacySettingsActivity6.O) {
                ilbVar.setText(ob6.M0(2131745411, "SecretWebPageInfo"));
                return;
            } else if (i == privacySettingsActivity6.J) {
                ilbVar.setText(ob6.M0(2131746578, "PrivacyBotsInfo"));
                return;
            } else if (i == privacySettingsActivity6.h) {
                ilbVar.setText(ob6.M0(2131746545, null));
                return;
            } else if (i == privacySettingsActivity6.M) {
                ilbVar.setText(ob6.M0(2131744063, "SuggestContactsInfo"));
                return;
            } else if (i == privacySettingsActivity6.y) {
                ilbVar.setText(ob6.M0(2131754163, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        if (f89Var.a.getTag() != null && ((Integer) f89Var.a.getTag()).intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        f89Var.a.setTag(Integer.valueOf(i));
        qmb qmbVar = (qmb) f89Var.a;
        qmbVar.setBetterLayout(true);
        i2 = this.d.webSessionsRow;
        if (i != i2) {
            i3 = this.d.phoneNumberRow;
            PrivacySettingsActivity privacySettingsActivity7 = this.d;
            if (i != i3) {
                i4 = privacySettingsActivity7.lastSeenRow;
                PrivacySettingsActivity privacySettingsActivity8 = this.d;
                if (i == i4) {
                    if (privacySettingsActivity8.getContactsController().t(0)) {
                        z6 = true;
                        b = 30;
                    } else {
                        str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 0);
                        z6 = false;
                    }
                    qmbVar.c(ob6.M0(2131746544, "PrivacyLastSeen"), str8, false, true);
                } else {
                    if (i != privacySettingsActivity8.n) {
                        i5 = privacySettingsActivity8.callsRow;
                        PrivacySettingsActivity privacySettingsActivity9 = this.d;
                        if (i != i5) {
                            i6 = privacySettingsActivity9.profilePhotoRow;
                            PrivacySettingsActivity privacySettingsActivity10 = this.d;
                            if (i != i6) {
                                i7 = privacySettingsActivity10.bioRow;
                                PrivacySettingsActivity privacySettingsActivity11 = this.d;
                                if (i != i7) {
                                    i8 = privacySettingsActivity11.musicRow;
                                    PrivacySettingsActivity privacySettingsActivity12 = this.d;
                                    if (i != i8) {
                                        i9 = privacySettingsActivity12.birthdayRow;
                                        PrivacySettingsActivity privacySettingsActivity13 = this.d;
                                        if (i != i9) {
                                            i10 = privacySettingsActivity13.giftsRow;
                                            PrivacySettingsActivity privacySettingsActivity14 = this.d;
                                            if (i != i10) {
                                                i11 = privacySettingsActivity14.forwardsRow;
                                                PrivacySettingsActivity privacySettingsActivity15 = this.d;
                                                if (i != i11) {
                                                    i12 = privacySettingsActivity15.voicesRow;
                                                    PrivacySettingsActivity privacySettingsActivity16 = this.d;
                                                    int i36 = 2131747480;
                                                    if (i != i12) {
                                                        i13 = privacySettingsActivity16.noncontactsRow;
                                                        PrivacySettingsActivity privacySettingsActivity17 = this.d;
                                                        if (i == i13) {
                                                            if (privacySettingsActivity17.Z) {
                                                                i36 = 2131751744;
                                                            } else if (privacySettingsActivity17.Y) {
                                                                i36 = 2131751743;
                                                            }
                                                            String M06 = ob6.M0(i36, null);
                                                            if (this.d.getMessagesController().k4.v2.f && !this.d.getMessagesController().k4.S1.f) {
                                                                z0 = ob6.M0(2131746539, null);
                                                            } else {
                                                                z0 = this.d.z0(ob6.M0(2131746539, null));
                                                            }
                                                            i18 = this.d.musicRow;
                                                            if (i18 != -1) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            qmbVar.c(z0, M06, false, z3);
                                                        } else if (i != privacySettingsActivity17.H) {
                                                            i14 = privacySettingsActivity17.deleteAccountRow;
                                                            PrivacySettingsActivity privacySettingsActivity18 = this.d;
                                                            if (i != i14) {
                                                                i15 = privacySettingsActivity18.paymentsClearRow;
                                                                if (i == i15) {
                                                                    qmbVar.b(ob6.M0(2131746526, "PrivacyPaymentsClear"), true);
                                                                } else {
                                                                    PrivacySettingsActivity privacySettingsActivity19 = this.d;
                                                                    if (i != privacySettingsActivity19.I) {
                                                                        i16 = privacySettingsActivity19.secretMapRow;
                                                                        if (i != i16) {
                                                                            i17 = this.d.contactsDeleteRow;
                                                                            if (i == i17) {
                                                                                qmbVar.b(ob6.M0(2131743949, "SyncContactsDelete"), true);
                                                                            }
                                                                        } else {
                                                                            int i37 = xea.l0;
                                                                            if (i37 != 0) {
                                                                                if (i37 != 1) {
                                                                                    if (i37 != 2) {
                                                                                        M0 = ob6.M0(2131748438, "MapPreviewProviderYandex");
                                                                                    } else {
                                                                                        M0 = ob6.M0(2131748441, "MapPreviewProviderNobody");
                                                                                    }
                                                                                } else {
                                                                                    M0 = ob6.M0(2131748442, "MapPreviewProviderGoogle");
                                                                                }
                                                                            } else {
                                                                                M0 = ob6.M0(2131748440, "MapPreviewProviderTelegram");
                                                                            }
                                                                            qmbVar.c(ob6.M0(2131748443, "MapPreviewProvider"), M0, this.d.S, true);
                                                                            this.d.S = false;
                                                                        }
                                                                    } else {
                                                                        qmbVar.b(ob6.M0(2131746591, null), true);
                                                                    }
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity18.getContactsController().H != 2) {
                                                                    z2 = true;
                                                                } else {
                                                                    int i38 = this.d.getContactsController().I;
                                                                    if (i38 <= 182) {
                                                                        str8 = ob6.G(i38 / 30, "Months", new Object[0]);
                                                                    } else if (i38 == 365) {
                                                                        str8 = ob6.G(12, "Months", new Object[0]);
                                                                    } else if (i38 == 548) {
                                                                        str8 = ob6.G(18, "Months", new Object[0]);
                                                                    } else if (i38 == 730) {
                                                                        str8 = ob6.G(24, "Months", new Object[0]);
                                                                    } else if (i38 > 30) {
                                                                        str8 = ob6.G((int) Math.round(i38 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str8 = ob6.G(i38, "Days", new Object[0]);
                                                                    }
                                                                    z2 = false;
                                                                }
                                                                qmbVar.c(ob6.M0(2131751560, "DeleteAccountIfAwayFor3"), str8, this.d.R, false);
                                                                this.d.R = false;
                                                            }
                                                        } else {
                                                            qmbVar.b(ob6.M0(2131743890, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity16.getContactsController().t(8)) {
                                                            A0 = null;
                                                            z4 = true;
                                                            b = 30;
                                                        } else {
                                                            if (!this.d.getUserConfig().p()) {
                                                                A0 = ob6.M0(2131747480, null);
                                                            } else {
                                                                A0 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 8);
                                                            }
                                                            z4 = false;
                                                        }
                                                        SpannableStringBuilder z02 = this.d.z0(ob6.M0(2131746487, null));
                                                        i19 = this.d.noncontactsRow;
                                                        if (i19 != -1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        qmbVar.c(z02, A0, false, z5);
                                                        yob.s(qmbVar.getValueImageView(), aob.m6, null, PorterDuff.Mode.MULTIPLY);
                                                        z9 = z4;
                                                    }
                                                } else {
                                                    if (privacySettingsActivity15.getContactsController().t(5)) {
                                                        z6 = true;
                                                        b = 30;
                                                    } else {
                                                        str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 5);
                                                        z6 = false;
                                                    }
                                                    qmbVar.c(ob6.M0(2131746566, "PrivacyForwards"), str8, false, true);
                                                }
                                            } else {
                                                if (privacySettingsActivity14.getContactsController().t(12)) {
                                                    A02 = null;
                                                    z2 = true;
                                                    b = 30;
                                                } else {
                                                    A02 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 12);
                                                    z2 = false;
                                                }
                                                qmbVar.c(ob6.M0(2131746558, null), A02, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity13.getContactsController().t(11)) {
                                                A03 = null;
                                                z2 = true;
                                                b = 30;
                                            } else {
                                                A03 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 11);
                                                z2 = false;
                                            }
                                            qmbVar.c(ob6.M0(2131746589, null), A03, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity12.getContactsController().t(14)) {
                                            A04 = null;
                                            z2 = true;
                                            b = 30;
                                        } else {
                                            A04 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 14);
                                            z2 = false;
                                        }
                                        qmbVar.c(ob6.M0(2131746533, null), A04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity11.getContactsController().t(9)) {
                                        z6 = true;
                                        b = 30;
                                    } else {
                                        str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 9);
                                        z6 = false;
                                    }
                                    qmbVar.c(ob6.M0(2131746596, "PrivacyBio"), str8, false, true);
                                }
                            } else {
                                if (privacySettingsActivity10.getContactsController().t(4)) {
                                    z6 = true;
                                    b = 30;
                                } else {
                                    str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 4);
                                    z6 = false;
                                }
                                qmbVar.c(ob6.M0(2131746506, "PrivacyProfilePhoto"), str8, false, true);
                            }
                        } else {
                            if (privacySettingsActivity9.getContactsController().t(2)) {
                                z6 = true;
                                b = 30;
                            } else {
                                str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 2);
                                z6 = false;
                            }
                            qmbVar.c(ob6.M0(2131752577, "Calls"), str8, false, true);
                        }
                    } else {
                        if (privacySettingsActivity8.getContactsController().t(1)) {
                            A05 = null;
                            z2 = true;
                            b = 30;
                        } else {
                            A05 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 1);
                            z2 = false;
                        }
                        qmbVar.c(ob6.M0(2131746546, null), A05, false, false);
                    }
                    z9 = z2;
                }
            } else {
                if (privacySettingsActivity7.getContactsController().t(6)) {
                    z6 = true;
                    b = 30;
                } else {
                    str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 6);
                    z6 = false;
                }
                qmbVar.c(ob6.M0(2131746519, "PrivacyPhone"), str8, false, true);
            }
            z9 = z6;
        } else {
            qmbVar.b(ob6.M0(2131742542, "WebSessionsTitle"), false);
        }
        qmbVar.r = z9;
        qmbVar.E = b;
        if (!z) {
            if (z9) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            qmbVar.y = f;
        } else {
            qmbVar.F = true;
        }
        qmbVar.invalidate();
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View qmbVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            qmbVar = new wkb(context);
                        } else {
                            qmbVar = new skb(context);
                        }
                    } else {
                        qmbVar = new rca(context, (uh9) null);
                    }
                } else {
                    qmbVar = new mf5(context);
                }
            } else {
                qmbVar = new ilb(context);
            }
        } else {
            qmbVar = new qmb(context);
        }
        return new f89(qmbVar);
    }
}
