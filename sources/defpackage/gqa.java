package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class gqa extends cqa {
    public final TL_stars.starGiftAttributePattern c;

    public gqa(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.a = stargiftattributepattern.name;
        this.b = stargiftattributepattern.getRarityPermille();
        this.c = stargiftattributepattern;
    }
}
