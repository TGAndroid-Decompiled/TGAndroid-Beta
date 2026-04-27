package io.noties.markwon.ext.latex;

import io.noties.markwon.image.ImageSizeResolver;

class JLatexBlockImageSizeResolver extends ImageSizeResolver {
    private final boolean fitCanvas;

    JLatexBlockImageSizeResolver(boolean z) {
        this.fitCanvas = z;
    }
}
