package oh;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f17135s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f17136w("FILES", R.raw.tab_files_reverse),
    f17137x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f17138y("LOCATION", R.raw.tab_location_reverse),
    E("STICKER", R.raw.tab_sticker_reverse),
    F("EMOJI", R.raw.tab_emoji_reverse),
    G("MODELS", R.raw.tab_models_reverse),
    H("MUSIC", R.raw.tab_music_reverse),
    I("POLL", R.raw.tab_poll_reverse),
    J("SYMBOLS", R.raw.tab_symbols_reverse),
    K("REPLIES", R.raw.tab_reply_reverse),
    EF0("WALLET", R.raw.tab_wallet_reverse),
    L,
    M("ARTICLE", R.raw.tab_article_reverse),
    N("GRAM", R.raw.gram_reverse),
    BOOSTS(R.raw.boosts, 25, 49),
    MONETIZATION(R.raw.monetize, 19, 45);
    
    public final int f17139a;
    public final int f17140b;
    public final int f17141c;
    public final int d;
    public final int f17142e;

    a(int i10, int i11, int i12) {
        this.f17139a = i10;
        this.f17140b = i10;
        this.d = i11;
        this.f17142e = i12;
        this.f17141c = -1;
    }

    a(int i10) {
        this.f17141c = i10;
        this.f17139a = -1;
        this.f17140b = -1;
        this.d = -1;
        this.f17142e = -1;
    }

    a(int i10) {
        this.f17139a = i10;
        this.f17140b = i10;
        this.d = -1;
        this.f17142e = -1;
        this.f17141c = -1;
    }

    a(String str, int i10) {
        this.f17139a = r2;
        this.f17140b = i10;
        this.d = -1;
        this.f17142e = -1;
        this.f17141c = -1;
    }
}
