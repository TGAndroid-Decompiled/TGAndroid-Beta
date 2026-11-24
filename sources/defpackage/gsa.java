package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class gsa extends csa {
    public final TL_stars.starGiftAttributePattern c;

    public gsa(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.a = stargiftattributepattern.name;
        this.b = stargiftattributepattern.getRarityPermille();
        this.c = stargiftattributepattern;
    }
}
