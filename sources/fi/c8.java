package fi;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class c8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new b8(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(i5.c.i(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        b8 b8Var = new b8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(b8Var.getObjectSize());
            b8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
