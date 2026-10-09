package ai;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class gb {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new fb(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(hg.c.h(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        fb fbVar = new fb(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(fbVar.getObjectSize());
            fbVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
