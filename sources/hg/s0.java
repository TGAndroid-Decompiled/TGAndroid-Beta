package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.dd0;
import org.telegram.ui.hd0;
import w7.a6;
public class s0 extends c implements LocationController.LocationFetchCallback {
    public final int K;
    public final Context L;
    public int M;
    public u6 N;
    public Location O;
    public Location P;
    public String Q;
    public String R;
    public Location S;
    public final int T;
    public final long U;
    public int V;
    public MessageObject W;
    public TLRPC.TL_channelLocation X;
    public ArrayList Y;
    public boolean Z;
    public final boolean f10730a0;
    public final c6 f10731b0;
    public boolean f10732c0;
    public TLRPC.TL_messageMediaVenue f10733d0;
    public TLRPC.TL_messageMediaVenue f10734e0;
    public boolean f10735f0;
    public final boolean f10736g0;
    public dd0 f10737h0;
    public boolean f10738i0;
    public boolean f10739j0;
    public boolean f10740k0;
    public FrameLayout f10741l0;

    public s0(Context context, int i10, long j10, boolean z10, c6 c6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = UserConfig.selectedAccount;
        this.V = -1;
        this.Y = new ArrayList();
        this.f10732c0 = true;
        this.f10739j0 = false;
        this.f10740k0 = false;
        this.f10736g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j10;
        this.f10730a0 = z10;
        this.f10731b0 = c6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.K).getSharingLocationInfo(this.U) == null && this.O == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10;
        int i11 = this.T;
        if (i11 == 8) {
            Location location = this.P;
            if (location != null || (location = this.O) != null) {
                this.Z = true;
                Q();
                LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            }
        } else if (i11 == 4) {
            Location location2 = this.P;
            if (location2 != null || (location2 = this.O) != null) {
                Location location3 = this.S;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.R = null;
                }
                this.Z = true;
                Q();
                LocationController.fetchLocationAddress(location2, this);
            }
        } else {
            Location location4 = this.P;
            if (location4 != null) {
                Location location5 = this.S;
                if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                    this.R = null;
                }
                this.Z = true;
                Q();
                if (this.d) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                LocationController.fetchLocationAddress(location4, i10, this);
            }
        }
    }

    public final Object J(int i10) {
        int i11 = this.T;
        int i12 = 4;
        if (i11 == 4) {
            if (this.R == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.R;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.P;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.P.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.O;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.O.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.W;
        ArrayList arrayList = this.f10510s;
        if (messageObject != null) {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.Y.get(i10 - 5);
            }
        } else {
            int i13 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i13 = 3;
                }
                if (i10 < i13) {
                    return null;
                }
                return this.Y.get(i10 - i13);
            } else if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                if (this.f10734e0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f10509r;
                if (i10 > i12) {
                    int i14 = i12 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i12;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.P = location;
        I();
        Q();
    }

    public final void M(Location location) {
        boolean z10;
        int i10;
        if (this.O == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = location;
        if (this.P == null) {
            I();
        }
        if (z10 && (i10 = this.V) > 0) {
            m(i10);
        }
        if (this.W != null) {
            n(1, new Object());
            if (!this.Y.isEmpty()) {
                r(2, this.Y.size(), new Object());
            }
        } else if (this.T != 2) {
            Q();
        } else if (!this.Y.isEmpty()) {
            r(2, this.Y.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Y = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((hd0) this.Y.get(i10)).f36758a == clientUserId || ((hd0) this.Y.get(i10)).f36759b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f10739j0 == z10 && this.f10740k0 == z11) {
            return;
        }
        this.f10739j0 = z10;
        this.f10740k0 = z11;
        if (z11) {
            this.f10733d0 = null;
            this.f10734e0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.f10741l0;
        if (frameLayout != null) {
            s4.o0 o0Var = (s4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new s4.o0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
            }
            this.f10741l0.setLayoutParams(o0Var);
            this.f10741l0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        u6 u6Var = this.N;
        if (u6Var != null) {
            int i10 = this.T;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.Q)) {
                    string = this.Q;
                } else if (!TextUtils.isEmpty(this.R)) {
                    string = this.R;
                } else if (this.Z) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.N.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.N.setHasLocation(true);
                return;
            }
            String str = "";
            if (i10 != 4 && this.P == null) {
                if (this.O != null) {
                    u6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.O.getAccuracy(), new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f10739j0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                u6Var.b(string2, str);
                this.N.setHasLocation(!this.f10739j0);
                return;
            }
            if (!TextUtils.isEmpty(this.Q)) {
                str = this.Q;
            } else if (!TextUtils.isEmpty(this.R)) {
                str = this.R;
            } else {
                Location location = this.P;
                if ((location == null && this.O == null) || this.Z) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.P.getLongitude()));
                } else {
                    Location location2 = this.O;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.O.getLongitude()));
                    } else if (!this.f10739j0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f10735f0) {
                this.N.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.N.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.N.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.N.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.T;
        int i14 = 6;
        if (i13 != 6 && i13 != 5 && i13 != 4 && !this.e) {
            int i15 = 0;
            if (this.W != null) {
                if (this.Y.isEmpty()) {
                    if (!this.f10736g0) {
                        i15 = 1;
                    }
                } else {
                    i15 = this.Y.size() + 3;
                }
                i12 = 2 + i15;
            } else if (i13 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                int size = this.Y.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i15 = 1;
                }
                i12 = size + i15;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.f10730a0;
                if (!z10 && this.f10507f) {
                    ArrayList arrayList = this.f10510s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f10509r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f10734e0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f10739j0;
                if (!z12 && (this.h || !this.f10507f)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                int i16 = i11 + (z11 ? 1 : 0);
                if (!z12) {
                    i12 = 0;
                }
                i12 = (i16 - i12) + i14;
            }
        }
        if (this.f10737h0 != null && this.f10738i0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: hg.s0.j(int):int");
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.Z = false;
        this.S = location;
        int i10 = this.T;
        if (i10 == 8) {
            this.R = str2;
        } else {
            this.R = str;
        }
        if (i10 == 7 && this.f10740k0) {
            this.f10733d0 = null;
            this.f10734e0 = null;
        }
        if (this.f10734e0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.f10733d0 = tL_messageMediaVenue;
            this.f10734e0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f10734e0 == null) {
                    u(2);
                    return;
                } else {
                    o(2);
                    return;
                }
            }
            q(1, 2);
            return;
        }
        Q();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        int i14 = this.T;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                s4.o0 o0Var = (s4.o0) view.getLayoutParams();
                if (o0Var == null) {
                    o0Var = new s4.o0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
                }
                view.setLayoutParams(o0Var);
                return;
            case 1:
                this.N = (u6) view;
                Q();
                return;
            case 2:
                m4 m4Var = (m4) view;
                if (this.W != null) {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f10734e0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f10507f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f10509r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        u4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f10510s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                u4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((w4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                u6 u6Var = (u6) view;
                if (this.O != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z11 = true;
                }
                u6Var.f22531s = z11;
                u6Var.invalidate();
                return;
            case 7:
                u6 u6Var2 = (u6) view;
                if (this.O != null) {
                    z11 = true;
                }
                u6Var2.setHasLocation(z11);
                return;
            case 8:
                w7 w7Var = (w7) view;
                if (i14 == 6) {
                    w7Var.b(this.W, this.O, this.f10739j0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.X;
                long j11 = this.U;
                if (tL_channelLocation != null) {
                    TextView textView = w7Var.d;
                    Location location = w7Var.v;
                    z9 z9Var = w7Var.f22620a;
                    w7Var.f22628x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    w7Var.f22623f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(w7Var.f22628x).getUser(Long.valueOf(j11));
                        if (user != null) {
                            w7Var.f22623f = new k9(0, user);
                            str2 = UserObject.getUserName(user);
                            z9Var.e(user, w7Var.f22623f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(w7Var.f22628x).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            k9 k9Var = new k9(chat);
                            w7Var.f22623f = k9Var;
                            str2 = chat.title;
                            z9Var.e(chat, k9Var);
                        }
                    }
                    w7Var.f22621b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    w7Var.e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.W;
                if (messageObject != null && i10 == 1) {
                    w7Var.b(messageObject, this.O, this.f10739j0);
                    return;
                }
                if (messageObject != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(j11);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.Y.size()) {
                    hd0 hd0Var = (hd0) this.Y.get(i18);
                    Location location2 = this.O;
                    TextView textView2 = w7Var.d;
                    z9 z9Var2 = w7Var.f22620a;
                    h5 h5Var = w7Var.f22621b;
                    Location location3 = w7Var.v;
                    w7Var.f22626s = hd0Var;
                    if (DialogObject.isUserDialog(hd0Var.f36758a)) {
                        TLRPC.User user2 = MessagesController.getInstance(w7Var.f22628x).getUser(Long.valueOf(hd0Var.f36758a));
                        if (user2 != null) {
                            w7Var.f22623f.m(w7Var.f22628x, user2);
                            h5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            z9Var2.e(user2, w7Var.f22623f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(w7Var.f22628x).getChat(Long.valueOf(-hd0Var.f36758a));
                        if (chat2 != null) {
                            w7Var.f22623f.k(w7Var.f22628x, chat2);
                            h5Var.l(chat2.title, false);
                            z9Var2.e(chat2, w7Var.f22623f);
                        }
                    }
                    IMapsProvider.LatLng position = hd0Var.e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = hd0Var.f36759b;
                    int i19 = message.edit_date;
                    if (i19 != 0) {
                        j10 = i19;
                    } else {
                        j10 = message.date;
                    }
                    String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(j10);
                    if (location2 != null) {
                        textView2.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                        return;
                    }
                    textView2.setText(formatLocationUpdateDate);
                    return;
                }
                return;
            case 11:
                if (this.f10739j0) {
                    i12 = g6.f19989i5;
                } else {
                    i12 = g6.f19972h5;
                }
                view.setBackgroundColor(g6.w0(i12, this.f10731b0));
                return;
            case 12:
                u4 u4Var2 = (u4) view;
                if (this.f10740k0) {
                    if (i10 != 1 || this.f10734e0 == null) {
                        z12 = false;
                    }
                    u4Var2.b(null, 2, z12, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f10733d0;
                    if (this.f10734e0 != null) {
                        z11 = true;
                    }
                    u4Var2.b(tL_messageMediaVenue2, 2, z11, this.f10732c0);
                    return;
                } else {
                    u4Var2.b(this.f10734e0, 2, false, this.f10732c0);
                    return;
                }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j10 = this.U;
        c6 c6Var = this.f10731b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f10741l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f10741l0.setLayoutParams(new s4.o0(-1, this.M));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new u6(context, c6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, c6Var);
                break;
            case 3:
                view2 = new u4(context, c6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
                frameLayout2.f22613a = radialProgressView;
                frameLayout2.addView(radialProgressView, a6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f22615c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.W5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 24.0f, -2, 17));
                TextView textView = new TextView(context);
                frameLayout2.f22614b = textView;
                textView.setTextColor(g6.w0(g6.X5, c6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, a6.a(-2.0f, 0.0f, 34.0f, 0.0f, 0.0f, -2, 17));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, a6.e(-2, -2, 17));
                TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
                int i12 = g6.A6;
                g10.setTextColor(g6.w0(i12, c6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, a6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, a6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(g6.w0(i12, c6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, a6.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                u6 u6Var = new u6(context, c6Var, true, false);
                u6Var.setDialogId(j10);
                view2 = u6Var;
                break;
            case 7:
                u6 u6Var2 = new u6(context, c6Var, true, true);
                u6Var2.setDialogId(j10);
                view2 = u6Var2;
                break;
            case 8:
                int i13 = this.T;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new w7(i11, context, c6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f22565a = frameLayout5;
                frameLayout5.setBackground(w5.e(new float[]{8.0f}, g6.w0(g6.Oh, c6Var)));
                frameLayout4.addView(frameLayout5, a6.a(48.0f, 16.0f, 10.0f, 16.0f, 0.0f, -1, 51));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(g6.w0(g6.Sh, c6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(h5Var, a6.d(-1.0f, -1));
                frameLayout5.setOutlineProvider(zf.j0.f50192b);
                frameLayout5.setClipToOutline(true);
                w7.c6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new ah.g0(this, 23));
                view2 = frameLayout4;
                break;
            case 10:
                View b7Var = new b7(context, (org.telegram.ui.Cells.d0) null);
                new cr(new ColorDrawable(g6.w0(g6.f19843a7, c6Var)), g6.W0(context, R.drawable.greydivider_bottom, g6.f19863b7)).f24198w = true;
                view2 = b7Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, c6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.f10737h0;
                break;
        }
        return new s4.b1(view2);
    }

    public void K() {
    }
}
