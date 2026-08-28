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
import g7.w7;
import g7.x7;
import g7.x8;
import kotlin.jvm.internal.i;
import v0.c;
import v0.p;
import w0.d;
public abstract class a {
    public static d a(Intent intent) {
        CreateCredentialException serializableExtra = intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
        if (serializableExtra == null) {
            return null;
        }
        String type = serializableExtra.getType();
        i.d(type, "getType(...)");
        return x8.a(serializableExtra.getMessage(), type);
    }

    public static c b(String str, Intent intent) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        i.d(data, "getData(...)");
        return w7.a(str, data);
    }

    public static w0.i c(Intent intent) {
        i.e(intent, "intent");
        GetCredentialException serializableExtra = intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (serializableExtra == null) {
            return null;
        }
        String type = serializableExtra.getType();
        i.d(type, "getType(...)");
        return x8.b(serializableExtra.getMessage(), type);
    }

    public static p d(Intent intent) {
        i.e(intent, "intent");
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        i.d(credential, "getCredential(...)");
        String type = credential.getType();
        i.d(type, "getType(...)");
        Bundle data = credential.getData();
        i.d(data, "getData(...)");
        return new p(x7.a(type, data));
    }

    public static AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float f(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.getAxisVelocity(i9);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int i(ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i9, i10, i11);
    }

    public static int j(ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i9, i10, i11);
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
}
