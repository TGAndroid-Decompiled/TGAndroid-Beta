package hg;

import android.location.Location;
import android.text.TextUtils;
import bi.h8;
import bi.v7;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class c extends pg.b {
    public a E;
    public int F;
    public long H;
    public boolean I;
    public boolean J;
    public final boolean d;
    public final boolean f10996e;
    public boolean h;
    public boolean f10998n;
    public Location v;
    public String f11001w;
    public String f11002x;
    public b f11003y;
    public boolean f10997f = false;
    public final ArrayList f10999r = new ArrayList();
    public final ArrayList f11000s = new ArrayList();
    public final int G = UserConfig.selectedAccount;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f10996e = z11;
    }

    public final void F() {
        if (this.F != 0) {
            ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str != null && str.length() != 0) {
            if (this.E != null) {
                Utilities.searchQueue.cancelRunnable(this.E);
                this.E = null;
            }
            this.J = true;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            a aVar = new a((u0) this, str, location, 0);
            this.E = aVar;
            dispatchQueue.postRunnable(aVar, 400L);
            return;
        }
        this.f11000s.clear();
        this.f10999r.clear();
        this.J = false;
        l();
    }

    public final void H(String str, Location location, boolean z10) {
        Location location2;
        Location location3;
        String str2;
        String str3;
        c cVar;
        String str4;
        Location location4;
        Locale locale;
        String str5;
        if ((location != null || this.d) && ((location2 = this.v) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            if (location == null) {
                location3 = null;
            } else {
                location3 = new Location(location);
            }
            this.v = location3;
            this.f11001w = str;
            if (this.h) {
                this.h = false;
                if (this.F != 0) {
                    ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
                    this.F = 0;
                }
            }
            h();
            this.h = true;
            this.f10997f = true;
            MessagesController messagesController = MessagesController.getInstance(this.G);
            if (this.d) {
                str2 = MessagesController.getInstance(this.G).storyVenueSearchBot;
            } else {
                str2 = MessagesController.getInstance(this.G).venueSearchBot;
            }
            TLObject userOrChat = messagesController.getUserOrChat(str2);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z10) {
                    int i10 = this.G;
                    if (!this.I) {
                        this.I = true;
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        if (this.d) {
                            str5 = MessagesController.getInstance(i10).storyVenueSearchBot;
                        } else {
                            str5 = MessagesController.getInstance(i10).venueSearchBot;
                        }
                        tL_contacts_resolveUsername.username = str5;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new v7(this, 8));
                    }
                }
            } else {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                tL_messages_getInlineBotResults.query = str3;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.G).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.H)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                }
                if (TextUtils.isEmpty(str) || (!this.d && !this.f10996e)) {
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    cVar.f10998n = false;
                } else {
                    this.f10998n = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.d) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            cVar = this;
                            str4 = str;
                            location4 = location;
                            Utilities.globalQueue.postRunnable(new h8(cVar, currentLocale, str4, locale, location4, str, 2));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    Utilities.globalQueue.postRunnable(new h8(cVar, currentLocale, str4, locale, location4, str, 2));
                }
                if (location4 == null) {
                    return;
                }
                cVar.F = ConnectionsManager.getInstance(cVar.G).sendRequest(tL_messages_getInlineBotResults, new bi.m1(10, this, str4));
                l();
            }
        }
    }
}
