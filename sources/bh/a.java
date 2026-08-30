package bh;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f1814s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f1815w("FILES", R.raw.tab_files_reverse),
    f1816x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f1817y("LOCATION", R.raw.tab_location_reverse),
    B("STICKER", R.raw.tab_sticker_reverse),
    C("EMOJI", R.raw.tab_emoji_reverse),
    D("MODELS", R.raw.tab_models_reverse),
    E("MUSIC", R.raw.tab_music_reverse),
    F("POLL", R.raw.tab_poll_reverse),
    G("SYMBOLS", R.raw.tab_symbols_reverse),
    H("REPLIES", R.raw.tab_reply_reverse),
    EF0("WALLET", R.raw.tab_wallet_reverse),
    I,
    J("ARTICLE", R.raw.tab_article_reverse),
    BOOSTS(R.raw.boosts, 25, 49),
    MONETIZATION(R.raw.monetize, 19, 45);
    
    public final int f1818a;
    public final int f1819b;
    public final int f1820c;
    public final int d;
    public final int e;

    a(int i10, int i11, int i12) {
        this.f1818a = i10;
        this.f1819b = i10;
        this.d = i11;
        this.e = i12;
        this.f1820c = -1;
    }

    a(int i10) {
        this.f1820c = i10;
        this.f1818a = -1;
        this.f1819b = -1;
        this.d = -1;
        this.e = -1;
    }

    a(int i10) {
        this.f1818a = i10;
        this.f1819b = i10;
        this.d = -1;
        this.e = -1;
        this.f1820c = -1;
    }

    a(String str, int i10) {
        this.f1818a = r2;
        this.f1819b = i10;
        this.d = -1;
        this.e = -1;
        this.f1820c = -1;
    }
}
