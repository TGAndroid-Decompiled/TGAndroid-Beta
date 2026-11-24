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
public final class dk8 extends n39 {
    public final Context c;
    public final PrivacySettingsActivity d;

    public dk8(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
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
        int b = s49Var.b();
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
    public final void t(s49 s49Var, int i) {
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
        CharSequence y0;
        int i18;
        boolean z3;
        CharSequence z0;
        boolean z4;
        int i19;
        boolean z5;
        boolean z6;
        String z02;
        String z03;
        String z04;
        String z05;
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
        int i31 = s49Var.f;
        byte b = 16;
        String str8 = null;
        boolean z9 = false;
        boolean z10 = true;
        if (i31 != 0) {
            if (i31 != 1) {
                if (i31 != 2) {
                    if (i31 != 3) {
                        if (i31 == 5) {
                            View view = s49Var.a;
                            wgb wgbVar = (wgb) view;
                            if (view.getTag() != null && ((Integer) s49Var.a.getTag()).intValue() == i) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            s49Var.a.setTag(Integer.valueOf(i));
                            wgbVar.setPrioritizeTitleOverValue(false);
                            i24 = this.d.autoDeleteMesages;
                            PrivacySettingsActivity privacySettingsActivity = this.d;
                            if (i == i24) {
                                int i32 = privacySettingsActivity.getUserConfig().q0;
                                if (i32 == -1) {
                                    str7 = null;
                                    z9 = true;
                                } else {
                                    if (i32 > 0) {
                                        M03 = k96.c0(i32 * 60);
                                    } else {
                                        M03 = k96.M0(2131747246, "PasswordOff");
                                    }
                                    str7 = M03;
                                }
                                wgbVar.u(k96.M0(2131753847, "AutoDeleteMessages"), str7, true, 2131232022, true);
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
                                                            str = k96.M0(2131753679, "BlockedEmpty");
                                                        } else if (i33 > 0) {
                                                            str = String.format(k96.D0().y, "%d", Integer.valueOf(i33));
                                                        } else {
                                                            z9 = true;
                                                            str = str9;
                                                        }
                                                        wgbVar.u(k96.M0(2131753678, "BlockedUsers"), str, true, 2131232024, true);
                                                    }
                                                } else {
                                                    if (gba.r.length() != 0) {
                                                        M02 = k96.M0(2131747245, null);
                                                    } else {
                                                        M02 = k96.M0(2131747246, null);
                                                    }
                                                    wgbVar.u(k96.M0(2131747464, null), M02, true, 2131232040, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity4.e;
                                                if (arrayList == null) {
                                                    z9 = true;
                                                    str2 = str9;
                                                } else if (arrayList.size() == 1 && wgbVar.c.getPaint().measureText(((TL_account.Passkey) this.d.e.get(0)).name) < gl.q.x / 3.0f) {
                                                    str2 = ((TL_account.Passkey) this.d.e.get(0)).name;
                                                } else if (this.d.e.size() > 0) {
                                                    str2 = this.d.e.size() + "";
                                                } else {
                                                    str2 = k96.M0(2131747246, null);
                                                }
                                                wgbVar.u(k96.M0(2131747458, null), str2, true, 2131232037, true);
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
                                                    str3 = k96.M0(2131747245, null);
                                                } else {
                                                    str3 = k96.M0(2131747246, null);
                                                }
                                                i30 = i34;
                                                str4 = str3;
                                            }
                                            wgbVar.u(k96.M0(2131743699, null), str4, true, i30, true);
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
                                                valueOf.setSpan(new wib(obj, 0), indexOf, i35, 0);
                                            }
                                            z8 = false;
                                            str5 = valueOf;
                                        }
                                        wgbVar.setPrioritizeTitleOverValue(true);
                                        String M04 = k96.M0(2131751190, null);
                                        wgbVar.x = wgbVar.getDefaultImageLeft();
                                        wgbVar.s = wgbVar.c(false);
                                        jia jiaVar = wgbVar.a;
                                        jiaVar.l(M04, false);
                                        jiaVar.i(null);
                                        jia jiaVar2 = wgbVar.d;
                                        jiaVar2.setVisibility(0);
                                        jiaVar2.l(str5, false);
                                        wgbVar.c.setVisibility(8);
                                        wgbVar.h.setVisibility(8);
                                        ry8 ry8Var = wgbVar.e;
                                        ry8Var.setVisibility(0);
                                        ry8Var.setTranslationX(0.0f);
                                        ry8Var.setTranslationY(0.0f);
                                        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
                                        ry8Var.setImageResource(2131232030);
                                        wgbVar.r = true;
                                        wgbVar.setWillNotDraw(false);
                                        Switch r1 = wgbVar.f;
                                        if (r1 != null) {
                                            r1.setVisibility(8);
                                        }
                                        tl tlVar = wgbVar.L;
                                        if (tlVar != null) {
                                            tlVar.g(null, false);
                                        }
                                        z9 = z8;
                                    }
                                } else {
                                    if (privacySettingsActivity.b0.h0() == 0) {
                                        if (this.d.getMessagesController().a == 0) {
                                            z9 = true;
                                            str6 = str9;
                                        } else {
                                            str6 = String.format(k96.D0().y, "%d", Integer.valueOf(this.d.getMessagesController().a));
                                        }
                                    } else {
                                        str6 = String.format(k96.D0().y, "%d", Integer.valueOf(this.d.b0.h0()));
                                    }
                                    this.d.getMessagesController().a = this.d.b0.h0();
                                    wgbVar.u(k96.M0(2131745359, null), str6, true, 2131232028, false);
                                }
                            }
                            wgbVar.h(16, z9, z7);
                            return;
                        }
                        return;
                    }
                    ahb ahbVar = (ahb) s49Var.a;
                    i20 = this.d.secretWebpageRow;
                    if (i != i20) {
                        i21 = this.d.contactsSyncRow;
                        if (i != i21) {
                            i22 = this.d.contactsSuggestRow;
                            if (i != i22) {
                                i23 = this.d.newChatsRow;
                                if (i == i23) {
                                    ahbVar.f(k96.M0(2131754168, "ArchiveAndMute"), this.d.X, false);
                                    return;
                                }
                                return;
                            }
                            ahbVar.f(k96.M0(2131744171, "SuggestContacts"), this.d.W, false);
                            return;
                        }
                        ahbVar.f(k96.M0(2131744057, "SyncContacts"), this.d.U, true);
                        return;
                    }
                    String M05 = k96.M0(2131745492, "SecretWebPage");
                    if (this.d.getMessagesController().z2 != 1) {
                        z10 = false;
                    }
                    ahbVar.f(M05, z10, false);
                    return;
                }
                ld5 ld5Var = (ld5) s49Var.a;
                PrivacySettingsActivity privacySettingsActivity5 = this.d;
                if (i == privacySettingsActivity5.f) {
                    ld5Var.setText(k96.M0(2131746578, "PrivacyTitle"));
                    return;
                } else if (i == 0) {
                    ld5Var.setText(k96.M0(2131745490, "SecurityTitle"));
                    return;
                } else if (i == privacySettingsActivity5.E) {
                    ld5Var.setText(k96.M0(2131751506, "DeleteMyAccount"));
                    return;
                } else if (i == privacySettingsActivity5.N) {
                    ld5Var.setText(k96.M0(2131745503, "SecretChat"));
                    return;
                } else if (i == privacySettingsActivity5.G) {
                    ld5Var.setText(k96.M0(2131746659, "PrivacyBots"));
                    return;
                } else if (i == privacySettingsActivity5.L) {
                    ld5Var.setText(k96.M0(2131751768, "Contacts"));
                    return;
                } else if (i == privacySettingsActivity5.x) {
                    ld5Var.setText(k96.M0(2131748093, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            mhb mhbVar = (mhb) s49Var.a;
            PrivacySettingsActivity privacySettingsActivity6 = this.d;
            if (i == privacySettingsActivity6.F) {
                mhbVar.setText(k96.M0(2131751585, "DeleteAccountHelp"));
                return;
            } else if (i == privacySettingsActivity6.r) {
                mhbVar.setText(k96.M0(2131749189, "GroupsAndChannelsHelp"));
                return;
            } else if (i == privacySettingsActivity6.w) {
                mhbVar.setText(k96.M0(2131745360, "SessionsSettingsInfo"));
                return;
            } else if (i == privacySettingsActivity6.O) {
                mhbVar.setText(k96.M0(2131745491, "SecretWebPageInfo"));
                return;
            } else if (i == privacySettingsActivity6.J) {
                mhbVar.setText(k96.M0(2131746658, "PrivacyBotsInfo"));
                return;
            } else if (i == privacySettingsActivity6.h) {
                mhbVar.setText(k96.M0(2131746625, null));
                return;
            } else if (i == privacySettingsActivity6.M) {
                mhbVar.setText(k96.M0(2131744169, "SuggestContactsInfo"));
                return;
            } else if (i == privacySettingsActivity6.y) {
                mhbVar.setText(k96.M0(2131754167, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        if (s49Var.a.getTag() != null && ((Integer) s49Var.a.getTag()).intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        s49Var.a.setTag(Integer.valueOf(i));
        uib uibVar = (uib) s49Var.a;
        uibVar.setBetterLayout(true);
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
                        str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 0);
                        z6 = false;
                    }
                    uibVar.c(k96.M0(2131746624, "PrivacyLastSeen"), str8, false, true);
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
                                                    int i36 = 2131747560;
                                                    if (i != i12) {
                                                        i13 = privacySettingsActivity16.noncontactsRow;
                                                        PrivacySettingsActivity privacySettingsActivity17 = this.d;
                                                        if (i == i13) {
                                                            if (privacySettingsActivity17.Z) {
                                                                i36 = 2131751767;
                                                            } else if (privacySettingsActivity17.Y) {
                                                                i36 = 2131751766;
                                                            }
                                                            String M06 = k96.M0(i36, null);
                                                            if (this.d.getMessagesController().k4.n2.f && !this.d.getMessagesController().k4.K1.f) {
                                                                y0 = k96.M0(2131746619, null);
                                                            } else {
                                                                y0 = this.d.y0(k96.M0(2131746619, null));
                                                            }
                                                            i18 = this.d.musicRow;
                                                            if (i18 != -1) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            uibVar.c(y0, M06, false, z3);
                                                        } else if (i != privacySettingsActivity17.H) {
                                                            i14 = privacySettingsActivity17.deleteAccountRow;
                                                            PrivacySettingsActivity privacySettingsActivity18 = this.d;
                                                            if (i != i14) {
                                                                i15 = privacySettingsActivity18.paymentsClearRow;
                                                                if (i == i15) {
                                                                    uibVar.b(k96.M0(2131746606, "PrivacyPaymentsClear"), true);
                                                                } else {
                                                                    PrivacySettingsActivity privacySettingsActivity19 = this.d;
                                                                    if (i != privacySettingsActivity19.I) {
                                                                        i16 = privacySettingsActivity19.secretMapRow;
                                                                        if (i != i16) {
                                                                            i17 = this.d.contactsDeleteRow;
                                                                            if (i == i17) {
                                                                                uibVar.b(k96.M0(2131744055, "SyncContactsDelete"), true);
                                                                            }
                                                                        } else {
                                                                            int i37 = gba.l0;
                                                                            if (i37 != 0) {
                                                                                if (i37 != 1) {
                                                                                    if (i37 != 2) {
                                                                                        M0 = k96.M0(2131748492, "MapPreviewProviderYandex");
                                                                                    } else {
                                                                                        M0 = k96.M0(2131748495, "MapPreviewProviderNobody");
                                                                                    }
                                                                                } else {
                                                                                    M0 = k96.M0(2131748496, "MapPreviewProviderGoogle");
                                                                                }
                                                                            } else {
                                                                                M0 = k96.M0(2131748494, "MapPreviewProviderTelegram");
                                                                            }
                                                                            uibVar.c(k96.M0(2131748497, "MapPreviewProvider"), M0, this.d.S, true);
                                                                            this.d.S = false;
                                                                        }
                                                                    } else {
                                                                        uibVar.b(k96.M0(2131746671, null), true);
                                                                    }
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity18.getContactsController().H != 2) {
                                                                    z2 = true;
                                                                } else {
                                                                    int i38 = this.d.getContactsController().I;
                                                                    if (i38 <= 182) {
                                                                        str8 = k96.G(i38 / 30, "Months", new Object[0]);
                                                                    } else if (i38 == 365) {
                                                                        str8 = k96.G(12, "Months", new Object[0]);
                                                                    } else if (i38 == 548) {
                                                                        str8 = k96.G(18, "Months", new Object[0]);
                                                                    } else if (i38 == 730) {
                                                                        str8 = k96.G(24, "Months", new Object[0]);
                                                                    } else if (i38 > 30) {
                                                                        str8 = k96.G((int) Math.round(i38 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str8 = k96.G(i38, "Days", new Object[0]);
                                                                    }
                                                                    z2 = false;
                                                                }
                                                                uibVar.c(k96.M0(2131751583, "DeleteAccountIfAwayFor3"), str8, this.d.R, false);
                                                                this.d.R = false;
                                                            }
                                                        } else {
                                                            uibVar.b(k96.M0(2131743996, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity16.getContactsController().t(8)) {
                                                            z0 = null;
                                                            z4 = true;
                                                            b = 30;
                                                        } else {
                                                            if (!this.d.getUserConfig().p()) {
                                                                z0 = k96.M0(2131747560, null);
                                                            } else {
                                                                z0 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 8);
                                                            }
                                                            z4 = false;
                                                        }
                                                        SpannableStringBuilder y02 = this.d.y0(k96.M0(2131746567, null));
                                                        i19 = this.d.noncontactsRow;
                                                        if (i19 != -1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        uibVar.c(y02, z0, false, z5);
                                                        zkb.s(uibVar.getValueImageView(), bkb.l6, null, PorterDuff.Mode.MULTIPLY);
                                                        z9 = z4;
                                                    }
                                                } else {
                                                    if (privacySettingsActivity15.getContactsController().t(5)) {
                                                        z6 = true;
                                                        b = 30;
                                                    } else {
                                                        str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 5);
                                                        z6 = false;
                                                    }
                                                    uibVar.c(k96.M0(2131746646, "PrivacyForwards"), str8, false, true);
                                                }
                                            } else {
                                                if (privacySettingsActivity14.getContactsController().t(12)) {
                                                    z02 = null;
                                                    z2 = true;
                                                    b = 30;
                                                } else {
                                                    z02 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 12);
                                                    z2 = false;
                                                }
                                                uibVar.c(k96.M0(2131746638, null), z02, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity13.getContactsController().t(11)) {
                                                z03 = null;
                                                z2 = true;
                                                b = 30;
                                            } else {
                                                z03 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 11);
                                                z2 = false;
                                            }
                                            uibVar.c(k96.M0(2131746669, null), z03, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity12.getContactsController().t(14)) {
                                            z04 = null;
                                            z2 = true;
                                            b = 30;
                                        } else {
                                            z04 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 14);
                                            z2 = false;
                                        }
                                        uibVar.c(k96.M0(2131746613, null), z04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity11.getContactsController().t(9)) {
                                        z6 = true;
                                        b = 30;
                                    } else {
                                        str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 9);
                                        z6 = false;
                                    }
                                    uibVar.c(k96.M0(2131746676, "PrivacyBio"), str8, false, true);
                                }
                            } else {
                                if (privacySettingsActivity10.getContactsController().t(4)) {
                                    z6 = true;
                                    b = 30;
                                } else {
                                    str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 4);
                                    z6 = false;
                                }
                                uibVar.c(k96.M0(2131746586, "PrivacyProfilePhoto"), str8, false, true);
                            }
                        } else {
                            if (privacySettingsActivity9.getContactsController().t(2)) {
                                z6 = true;
                                b = 30;
                            } else {
                                str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 2);
                                z6 = false;
                            }
                            uibVar.c(k96.M0(2131752584, "Calls"), str8, false, true);
                        }
                    } else {
                        if (privacySettingsActivity8.getContactsController().t(1)) {
                            z05 = null;
                            z2 = true;
                            b = 30;
                        } else {
                            z05 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 1);
                            z2 = false;
                        }
                        uibVar.c(k96.M0(2131746626, null), z05, false, false);
                    }
                    z9 = z2;
                }
            } else {
                if (privacySettingsActivity7.getContactsController().t(6)) {
                    z6 = true;
                    b = 30;
                } else {
                    str8 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 6);
                    z6 = false;
                }
                uibVar.c(k96.M0(2131746599, "PrivacyPhone"), str8, false, true);
            }
            z9 = z6;
        } else {
            uibVar.b(k96.M0(2131742648, "WebSessionsTitle"), false);
        }
        uibVar.r = z9;
        uibVar.E = b;
        if (!z) {
            if (z9) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            uibVar.y = f;
        } else {
            uibVar.F = true;
        }
        uibVar.invalidate();
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View uibVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            uibVar = new ahb(context);
                        } else {
                            uibVar = new wgb(context);
                        }
                    } else {
                        uibVar = new b9a(context, (de9) null);
                    }
                } else {
                    uibVar = new ld5(context);
                }
            } else {
                uibVar = new mhb(context);
            }
        } else {
            uibVar = new uib(context);
        }
        return new s49(uibVar);
    }
}
