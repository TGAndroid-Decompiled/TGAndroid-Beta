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
public final class gm8 extends q59 {
    public final Context c;
    public final PrivacySettingsActivity d;

    public gm8(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
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
        int b = u69Var.b();
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
    public final void t(u69 u69Var, int i) {
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
        int i31 = u69Var.f;
        byte b = 16;
        String str8 = null;
        boolean z9 = false;
        boolean z10 = true;
        if (i31 != 0) {
            if (i31 != 1) {
                if (i31 != 2) {
                    if (i31 != 3) {
                        if (i31 == 5) {
                            View view = u69Var.a;
                            xib xibVar = (xib) view;
                            if (view.getTag() != null && ((Integer) u69Var.a.getTag()).intValue() == i) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            u69Var.a.setTag(Integer.valueOf(i));
                            xibVar.setPrioritizeTitleOverValue(false);
                            i24 = this.d.autoDeleteMesages;
                            PrivacySettingsActivity privacySettingsActivity = this.d;
                            if (i == i24) {
                                int i32 = privacySettingsActivity.getUserConfig().q0;
                                if (i32 == -1) {
                                    str7 = null;
                                    z9 = true;
                                } else {
                                    if (i32 > 0) {
                                        M03 = jb6.c0(i32 * 60);
                                    } else {
                                        M03 = jb6.M0(2131747172, "PasswordOff");
                                    }
                                    str7 = M03;
                                }
                                xibVar.u(jb6.M0(2131753815, "AutoDeleteMessages"), str7, true, 2131232023, true);
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
                                                            str = jb6.M0(2131753647, "BlockedEmpty");
                                                        } else if (i33 > 0) {
                                                            str = String.format(jb6.D0().y, "%d", Integer.valueOf(i33));
                                                        } else {
                                                            z9 = true;
                                                            str = str9;
                                                        }
                                                        xibVar.u(jb6.M0(2131753646, "BlockedUsers"), str, true, 2131232025, true);
                                                    }
                                                } else {
                                                    if (gda.r.length() != 0) {
                                                        M02 = jb6.M0(2131747171, null);
                                                    } else {
                                                        M02 = jb6.M0(2131747172, null);
                                                    }
                                                    xibVar.u(jb6.M0(2131747390, null), M02, true, 2131232041, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity4.e;
                                                if (arrayList == null) {
                                                    z9 = true;
                                                    str2 = str9;
                                                } else if (arrayList.size() == 1 && xibVar.c.getPaint().measureText(((TL_account.Passkey) this.d.e.get(0)).name) < gm.q.x / 3.0f) {
                                                    str2 = ((TL_account.Passkey) this.d.e.get(0)).name;
                                                } else if (this.d.e.size() > 0) {
                                                    str2 = this.d.e.size() + "";
                                                } else {
                                                    str2 = jb6.M0(2131747172, null);
                                                }
                                                xibVar.u(jb6.M0(2131747384, null), str2, true, 2131232038, true);
                                            }
                                        } else {
                                            TL_account.Password password = privacySettingsActivity3.d;
                                            int i34 = 2131231766;
                                            if (password == null) {
                                                i30 = 2131231766;
                                                z9 = true;
                                                str4 = str9;
                                            } else {
                                                if (password.has_password) {
                                                    i34 = 2131231767;
                                                    str3 = jb6.M0(2131747171, null);
                                                } else {
                                                    str3 = jb6.M0(2131747172, null);
                                                }
                                                i30 = i34;
                                                str4 = str3;
                                            }
                                            xibVar.u(jb6.M0(2131743625, null), str4, true, i30, true);
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
                                                valueOf.setSpan(new xkb(obj, 0), indexOf, i35, 0);
                                            }
                                            z8 = false;
                                            str5 = valueOf;
                                        }
                                        xibVar.setPrioritizeTitleOverValue(true);
                                        String M04 = jb6.M0(2131751139, null);
                                        xibVar.x = xibVar.getDefaultImageLeft();
                                        xibVar.s = xibVar.c(false);
                                        lka lkaVar = xibVar.a;
                                        lkaVar.l(M04, false);
                                        lkaVar.i(null);
                                        lka lkaVar2 = xibVar.d;
                                        lkaVar2.setVisibility(0);
                                        lkaVar2.l(str5, false);
                                        xibVar.c.setVisibility(8);
                                        xibVar.h.setVisibility(8);
                                        s09 s09Var = xibVar.e;
                                        s09Var.setVisibility(0);
                                        s09Var.setTranslationX(0.0f);
                                        s09Var.setTranslationY(0.0f);
                                        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
                                        s09Var.setImageResource(2131232031);
                                        xibVar.r = true;
                                        xibVar.setWillNotDraw(false);
                                        Switch r1 = xibVar.f;
                                        if (r1 != null) {
                                            r1.setVisibility(8);
                                        }
                                        tm tmVar = xibVar.L;
                                        if (tmVar != null) {
                                            tmVar.g(null, false);
                                        }
                                        z9 = z8;
                                    }
                                } else {
                                    if (privacySettingsActivity.b0.i0() == 0) {
                                        if (this.d.getMessagesController().a == 0) {
                                            z9 = true;
                                            str6 = str9;
                                        } else {
                                            str6 = String.format(jb6.D0().y, "%d", Integer.valueOf(this.d.getMessagesController().a));
                                        }
                                    } else {
                                        str6 = String.format(jb6.D0().y, "%d", Integer.valueOf(this.d.b0.i0()));
                                    }
                                    this.d.getMessagesController().a = this.d.b0.i0();
                                    xibVar.u(jb6.M0(2131745285, null), str6, true, 2131232029, false);
                                }
                            }
                            xibVar.h(16, z9, z7);
                            return;
                        }
                        return;
                    }
                    bjb bjbVar = (bjb) u69Var.a;
                    i20 = this.d.secretWebpageRow;
                    if (i != i20) {
                        i21 = this.d.contactsSyncRow;
                        if (i != i21) {
                            i22 = this.d.contactsSuggestRow;
                            if (i != i22) {
                                i23 = this.d.newChatsRow;
                                if (i == i23) {
                                    bjbVar.f(jb6.M0(2131754136, "ArchiveAndMute"), this.d.X, false);
                                    return;
                                }
                                return;
                            }
                            bjbVar.f(jb6.M0(2131744097, "SuggestContacts"), this.d.W, false);
                            return;
                        }
                        bjbVar.f(jb6.M0(2131743983, "SyncContacts"), this.d.U, true);
                        return;
                    }
                    String M05 = jb6.M0(2131745418, "SecretWebPage");
                    if (this.d.getMessagesController().z2 != 1) {
                        z10 = false;
                    }
                    bjbVar.f(M05, z10, false);
                    return;
                }
                jf5 jf5Var = (jf5) u69Var.a;
                PrivacySettingsActivity privacySettingsActivity5 = this.d;
                if (i == privacySettingsActivity5.f) {
                    jf5Var.setText(jb6.M0(2131746504, "PrivacyTitle"));
                    return;
                } else if (i == 0) {
                    jf5Var.setText(jb6.M0(2131745416, "SecurityTitle"));
                    return;
                } else if (i == privacySettingsActivity5.E) {
                    jf5Var.setText(jb6.M0(2131751455, "DeleteMyAccount"));
                    return;
                } else if (i == privacySettingsActivity5.N) {
                    jf5Var.setText(jb6.M0(2131745429, "SecretChat"));
                    return;
                } else if (i == privacySettingsActivity5.G) {
                    jf5Var.setText(jb6.M0(2131746585, "PrivacyBots"));
                    return;
                } else if (i == privacySettingsActivity5.L) {
                    jf5Var.setText(jb6.M0(2131751717, "Contacts"));
                    return;
                } else if (i == privacySettingsActivity5.x) {
                    jf5Var.setText(jb6.M0(2131748042, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            njb njbVar = (njb) u69Var.a;
            PrivacySettingsActivity privacySettingsActivity6 = this.d;
            if (i == privacySettingsActivity6.F) {
                njbVar.setText(jb6.M0(2131751534, "DeleteAccountHelp"));
                return;
            } else if (i == privacySettingsActivity6.r) {
                njbVar.setText(jb6.M0(2131749138, "GroupsAndChannelsHelp"));
                return;
            } else if (i == privacySettingsActivity6.w) {
                njbVar.setText(jb6.M0(2131745286, "SessionsSettingsInfo"));
                return;
            } else if (i == privacySettingsActivity6.O) {
                njbVar.setText(jb6.M0(2131745417, "SecretWebPageInfo"));
                return;
            } else if (i == privacySettingsActivity6.J) {
                njbVar.setText(jb6.M0(2131746584, "PrivacyBotsInfo"));
                return;
            } else if (i == privacySettingsActivity6.h) {
                njbVar.setText(jb6.M0(2131746551, null));
                return;
            } else if (i == privacySettingsActivity6.M) {
                njbVar.setText(jb6.M0(2131744095, "SuggestContactsInfo"));
                return;
            } else if (i == privacySettingsActivity6.y) {
                njbVar.setText(jb6.M0(2131754135, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        if (u69Var.a.getTag() != null && ((Integer) u69Var.a.getTag()).intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        u69Var.a.setTag(Integer.valueOf(i));
        vkb vkbVar = (vkb) u69Var.a;
        vkbVar.setBetterLayout(true);
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
                    vkbVar.c(jb6.M0(2131746550, "PrivacyLastSeen"), str8, false, true);
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
                                                    int i36 = 2131747486;
                                                    if (i != i12) {
                                                        i13 = privacySettingsActivity16.noncontactsRow;
                                                        PrivacySettingsActivity privacySettingsActivity17 = this.d;
                                                        if (i == i13) {
                                                            if (privacySettingsActivity17.Z) {
                                                                i36 = 2131751716;
                                                            } else if (privacySettingsActivity17.Y) {
                                                                i36 = 2131751715;
                                                            }
                                                            String M06 = jb6.M0(i36, null);
                                                            if (this.d.getMessagesController().l4.n2.f && !this.d.getMessagesController().l4.K1.f) {
                                                                z0 = jb6.M0(2131746545, null);
                                                            } else {
                                                                z0 = this.d.z0(jb6.M0(2131746545, null));
                                                            }
                                                            i18 = this.d.musicRow;
                                                            if (i18 != -1) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            vkbVar.c(z0, M06, false, z3);
                                                        } else if (i != privacySettingsActivity17.H) {
                                                            i14 = privacySettingsActivity17.deleteAccountRow;
                                                            PrivacySettingsActivity privacySettingsActivity18 = this.d;
                                                            if (i != i14) {
                                                                i15 = privacySettingsActivity18.paymentsClearRow;
                                                                if (i == i15) {
                                                                    vkbVar.b(jb6.M0(2131746532, "PrivacyPaymentsClear"), true);
                                                                } else {
                                                                    PrivacySettingsActivity privacySettingsActivity19 = this.d;
                                                                    if (i != privacySettingsActivity19.I) {
                                                                        i16 = privacySettingsActivity19.secretMapRow;
                                                                        if (i != i16) {
                                                                            i17 = this.d.contactsDeleteRow;
                                                                            if (i == i17) {
                                                                                vkbVar.b(jb6.M0(2131743981, "SyncContactsDelete"), true);
                                                                            }
                                                                        } else {
                                                                            int i37 = gda.l0;
                                                                            if (i37 != 0) {
                                                                                if (i37 != 1) {
                                                                                    if (i37 != 2) {
                                                                                        M0 = jb6.M0(2131748441, "MapPreviewProviderYandex");
                                                                                    } else {
                                                                                        M0 = jb6.M0(2131748444, "MapPreviewProviderNobody");
                                                                                    }
                                                                                } else {
                                                                                    M0 = jb6.M0(2131748445, "MapPreviewProviderGoogle");
                                                                                }
                                                                            } else {
                                                                                M0 = jb6.M0(2131748443, "MapPreviewProviderTelegram");
                                                                            }
                                                                            vkbVar.c(jb6.M0(2131748446, "MapPreviewProvider"), M0, this.d.S, true);
                                                                            this.d.S = false;
                                                                        }
                                                                    } else {
                                                                        vkbVar.b(jb6.M0(2131746597, null), true);
                                                                    }
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity18.getContactsController().H != 2) {
                                                                    z2 = true;
                                                                } else {
                                                                    int i38 = this.d.getContactsController().I;
                                                                    if (i38 <= 182) {
                                                                        str8 = jb6.G(i38 / 30, "Months", new Object[0]);
                                                                    } else if (i38 == 365) {
                                                                        str8 = jb6.G(12, "Months", new Object[0]);
                                                                    } else if (i38 == 548) {
                                                                        str8 = jb6.G(18, "Months", new Object[0]);
                                                                    } else if (i38 == 730) {
                                                                        str8 = jb6.G(24, "Months", new Object[0]);
                                                                    } else if (i38 > 30) {
                                                                        str8 = jb6.G((int) Math.round(i38 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str8 = jb6.G(i38, "Days", new Object[0]);
                                                                    }
                                                                    z2 = false;
                                                                }
                                                                vkbVar.c(jb6.M0(2131751532, "DeleteAccountIfAwayFor3"), str8, this.d.R, false);
                                                                this.d.R = false;
                                                            }
                                                        } else {
                                                            vkbVar.b(jb6.M0(2131743922, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity16.getContactsController().t(8)) {
                                                            A0 = null;
                                                            z4 = true;
                                                            b = 30;
                                                        } else {
                                                            if (!this.d.getUserConfig().p()) {
                                                                A0 = jb6.M0(2131747486, null);
                                                            } else {
                                                                A0 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 8);
                                                            }
                                                            z4 = false;
                                                        }
                                                        SpannableStringBuilder z02 = this.d.z0(jb6.M0(2131746493, null));
                                                        i19 = this.d.noncontactsRow;
                                                        if (i19 != -1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        vkbVar.c(z02, A0, false, z5);
                                                        anb.s(vkbVar.getValueImageView(), cmb.l6, null, PorterDuff.Mode.MULTIPLY);
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
                                                    vkbVar.c(jb6.M0(2131746572, "PrivacyForwards"), str8, false, true);
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
                                                vkbVar.c(jb6.M0(2131746564, null), A02, false, true);
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
                                            vkbVar.c(jb6.M0(2131746595, null), A03, false, true);
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
                                        vkbVar.c(jb6.M0(2131746539, null), A04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity11.getContactsController().t(9)) {
                                        z6 = true;
                                        b = 30;
                                    } else {
                                        str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 9);
                                        z6 = false;
                                    }
                                    vkbVar.c(jb6.M0(2131746602, "PrivacyBio"), str8, false, true);
                                }
                            } else {
                                if (privacySettingsActivity10.getContactsController().t(4)) {
                                    z6 = true;
                                    b = 30;
                                } else {
                                    str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 4);
                                    z6 = false;
                                }
                                vkbVar.c(jb6.M0(2131746512, "PrivacyProfilePhoto"), str8, false, true);
                            }
                        } else {
                            if (privacySettingsActivity9.getContactsController().t(2)) {
                                z6 = true;
                                b = 30;
                            } else {
                                str8 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 2);
                                z6 = false;
                            }
                            vkbVar.c(jb6.M0(2131752549, "Calls"), str8, false, true);
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
                        vkbVar.c(jb6.M0(2131746552, null), A05, false, false);
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
                vkbVar.c(jb6.M0(2131746525, "PrivacyPhone"), str8, false, true);
            }
            z9 = z6;
        } else {
            vkbVar.b(jb6.M0(2131742574, "WebSessionsTitle"), false);
        }
        vkbVar.r = z9;
        vkbVar.E = b;
        if (!z) {
            if (z9) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            vkbVar.y = f;
        } else {
            vkbVar.F = true;
        }
        vkbVar.invalidate();
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View vkbVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            vkbVar = new bjb(context);
                        } else {
                            vkbVar = new xib(context);
                        }
                    } else {
                        vkbVar = new bba(context, (hg9) null);
                    }
                } else {
                    vkbVar = new jf5(context);
                }
            } else {
                vkbVar = new njb(context);
            }
        } else {
            vkbVar = new vkb(context);
        }
        return new u69(vkbVar);
    }
}
