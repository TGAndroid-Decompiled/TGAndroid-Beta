package g1;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import i7.f8;
import i7.g8;
import i7.u8;
import kotlin.jvm.internal.j;
import v0.c;
import v0.o;
import w0.d;
import w0.i;
public abstract class a {
    public static d a(Intent intent) {
        CreateCredentialException serializableExtra = intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
        if (serializableExtra == null) {
            return null;
        }
        String type = serializableExtra.getType();
        j.d(type, "getType(...)");
        return u8.a(serializableExtra.getMessage(), type);
    }

    public static c b(String str, Intent intent) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        j.d(data, "getData(...)");
        return f8.a(str, data);
    }

    public static i c(Intent intent) {
        j.e(intent, "intent");
        GetCredentialException serializableExtra = intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (serializableExtra == null) {
            return null;
        }
        String type = serializableExtra.getType();
        j.d(type, "getType(...)");
        return u8.b(serializableExtra.getMessage(), type);
    }

    public static o d(Intent intent) {
        j.e(intent, "intent");
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        j.d(credential, "getCredential(...)");
        String type = credential.getType();
        j.d(type, "getType(...)");
        Bundle data = credential.getData();
        j.d(data, "getData(...)");
        return new o(g8.a(type, data));
    }

    public static AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float f(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int i(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    public static int j(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
}
