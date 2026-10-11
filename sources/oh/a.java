package oh;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f17217s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f17218w("FILES", R.raw.tab_files_reverse),
    f17219x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f17220y("LOCATION", R.raw.tab_location_reverse),
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
    
    public final int f17221a;
    public final int f17222b;
    public final int f17223c;
    public final int d;
    public final int f17224e;

    a(int i10, int i11, int i12) {
        this.f17221a = i10;
        this.f17222b = i10;
        this.d = i11;
        this.f17224e = i12;
        this.f17223c = -1;
    }

    a(int i10) {
        this.f17223c = i10;
        this.f17221a = -1;
        this.f17222b = -1;
        this.d = -1;
        this.f17224e = -1;
    }

    a(int i10) {
        this.f17221a = i10;
        this.f17222b = i10;
        this.d = -1;
        this.f17224e = -1;
        this.f17223c = -1;
    }

    a(String str, int i10) {
        this.f17221a = r2;
        this.f17222b = i10;
        this.d = -1;
        this.f17224e = -1;
        this.f17223c = -1;
    }
}
