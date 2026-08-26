package org.telegram.messenger.camera;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public abstract class CameraView$VideoRecorder$$ExternalSyntheticOutline0 {
    public static FloatBuffer m(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
}
