package defpackage;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class a6b {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new z5b(storyItem).readParams(nativeByteBuffer, true);
        } else {
            zo4.k(hg9.j(readInt32, "(story) can't read params version = "));
        }
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        z5b z5bVar = new z5b(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(z5bVar.getObjectSize());
            z5bVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
