package org.telegram.messenger.chromecast;

import java.util.ArrayList;

public final class ChromecastMediaVariations {
    public final ArrayList variations;

    public ChromecastMediaVariations(ArrayList arrayList) {
        this.variations = arrayList;
    }

    public ChromecastMediaVariations(ChromecastMedia chromecastMedia) {
        ArrayList arrayList = new ArrayList(1);
        this.variations = arrayList;
        arrayList.add(chromecastMedia);
    }
}
