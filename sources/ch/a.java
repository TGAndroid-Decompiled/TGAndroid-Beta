package ch;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f2511s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f2512w("FILES", R.raw.tab_files_reverse),
    f2513x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f2514y("LOCATION", R.raw.tab_location_reverse),
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
    
    public final int f2515a;
    public final int f2516b;
    public final int f2517c;
    public final int d;
    public final int f2518e;

    a(int i10, int i11, int i12) {
        this.f2515a = i10;
        this.f2516b = i10;
        this.d = i11;
        this.f2518e = i12;
        this.f2517c = -1;
    }

    a(int i10) {
        this.f2517c = i10;
        this.f2515a = -1;
        this.f2516b = -1;
        this.d = -1;
        this.f2518e = -1;
    }

    a(int i10) {
        this.f2515a = i10;
        this.f2516b = i10;
        this.d = -1;
        this.f2518e = -1;
        this.f2517c = -1;
    }

    a(String str, int i10) {
        this.f2515a = r2;
        this.f2516b = i10;
        this.d = -1;
        this.f2518e = -1;
        this.f2517c = -1;
    }
}
