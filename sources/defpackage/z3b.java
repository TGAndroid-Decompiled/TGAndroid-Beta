package defpackage;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class z3b {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new y3b(storyItem).readParams(nativeByteBuffer, true);
        } else {
            wn4.j(de9.k(readInt32, "(story) can't read params version = "));
        }
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        y3b y3bVar = new y3b(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(y3bVar.getObjectSize());
            y3bVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
